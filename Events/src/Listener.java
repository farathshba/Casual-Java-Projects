import java.awt.event.*;

import javax.swing.JOptionPane;

public class Listener implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Message entered!");
	}
}
