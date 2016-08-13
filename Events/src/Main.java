import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton okButton = new JButton("Ok");
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.add(okButton);	
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		ActionListener listener = new Listener();
		okButton.addActionListener(listener);
	}
}
