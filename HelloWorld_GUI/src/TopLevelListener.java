import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TopLevelListener extends JFrame implements ActionListener
{
	//	GUI Components
	static TopLevelListener frame = new TopLevelListener();
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
	
	public void addComp()
	{
		this.buttonOne.setText("First Button");
		this.buttonTwo.setText("Second Button");
		this.add(buttonOne, BorderLayout.NORTH);
		this.add(buttonTwo, BorderLayout.SOUTH);
		
		// Register GUI comp with the Listener (Top-Level methodlogy)
		this.buttonOne.addActionListener(this);
		this.buttonTwo.addActionListener(this);
	}
	
	//	Listener
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this.buttonOne)
		{
			JOptionPane.showMessageDialog(null, "Button ONE DEPRESSED.");
		}
		else if(e.getSource() == this.buttonTwo)
		{
			JOptionPane.showMessageDialog(null, "Button TWO DEPRESSED.");
		}
	}
}
