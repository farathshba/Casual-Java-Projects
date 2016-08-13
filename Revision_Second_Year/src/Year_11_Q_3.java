import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.*;

public class Year_11_Q_3 
{
	private JButton button = new JButton("Question 3");
	
	public static void main(String[] args)
	{
		Year_11_Q_3 gui = new Year_11_Q_3();
		gui.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Registration of the button to actionListener
		button.addActionListener(new buttonListener());
		//	Addition of the components
		frame.add(button);
	}
	
	public class buttonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "You clicked me!");
		}
	}
}
