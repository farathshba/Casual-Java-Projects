import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyGUI extends JFrame implements ActionListener 
{
	private JPanel panel;
	private JButton button;
	private JLabel label;
	
	public MyGUI()
	{
		panel = new JPanel();
		label = new JLabel("DON'T CLICK ME");
		button = new JButton("Click Me");
		

		panel.add(button, BorderLayout.CENTER);
	}
	
	public void go()
	{
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.add(panel);
		
		// Register the component with the Listener
		button.addActionListener(this);
	}
	
	public static void main(String[] args)
	{
		MyGUI gui = new MyGUI();
		gui.go();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		panel.add(label, BorderLayout.NORTH);
		panel.repaint();
		this.repaint();
	}
	
}
