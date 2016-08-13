import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener
{
	public Main() 
	{
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(1);
		
		JButton ok = new JButton("Ok");
		frame.add(ok);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//	Register the ActionListener object with the "Ok" Button 
		ok.addActionListener(this);
	}
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Hi, I am activated!!");
	}
}
