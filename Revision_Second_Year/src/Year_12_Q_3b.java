import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Year_12_Q_3b extends JFrame 
{
	private JButton firstBut = new JButton("Click me");
	private JButton secondBut = new JButton("Don't click him, click me!");
	
	public Year_12_Q_3b()
	{
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.add(firstBut, BorderLayout.NORTH);
		this.add(secondBut, BorderLayout.SOUTH);
		
		//	Button is registered
		firstBut.addActionListener(new buttonListener());
		secondBut.addActionListener(new buttonListener());
	}
	
	public static void main(String[] args)
	{
		new Year_12_Q_3b();
	}
	
	public class buttonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == firstBut)
			{
				secondBut.setText("Don't click him again!");
			}
			else if(e.getSource() == secondBut)
			{
				firstBut.setText("CLICK ME NOW! ");
			}
		}
	}
}
