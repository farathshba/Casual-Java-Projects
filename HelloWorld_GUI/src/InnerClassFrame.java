import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InnerClassFrame extends JFrame
{
	//	GUI Components
	static InnerClassFrame frame = new InnerClassFrame();
	static JButton buttonOne = new JButton();
	static JButton buttonTwo = new JButton();
	
	//	Main method
	public static void main(String[] args)
	{
		frame.start();
		frame.addComp();
	}
	
	// Mutator methods
	public void start()
	{
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public class InnerClassFrameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == buttonOne)
			{
				JOptionPane.showMessageDialog(null, "Button ONE DEPRESSED.");
			}
			else if(e.getSource() == buttonTwo)
			{
				JOptionPane.showMessageDialog(null, "Button TWO DEPRESSED.");
			}
		}
	}
	
	public void addComp()
	{
		this.buttonOne.setText("First Button");
		this.buttonTwo.setText("Second Button");
		this.add(buttonOne, BorderLayout.NORTH);
		this.add(buttonTwo, BorderLayout.SOUTH);
		
		// Register GUI comp with the Listener (Top-Level methodlogy)
		InnerClassFrameListener listener = new InnerClassFrameListener();
		
		this.buttonOne.addActionListener(listener);
		this.buttonTwo.addActionListener(listener);
	}
}
