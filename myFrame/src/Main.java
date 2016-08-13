import java.awt.BorderLayout;

import javax.swing.*;

public class Main 
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Window1");
		frame.setVisible(true);
		frame.add(new JButton("Ok"));
		
		Frame frame1 = new Frame("Window2");
		frame1.setVisible(true);
	}
}
