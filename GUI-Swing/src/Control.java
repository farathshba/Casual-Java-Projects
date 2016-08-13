import java.awt.event.*;

import javax.swing.JOptionPane;

public class Control implements ActionListener  
{
	public Control()
	{
		
	}
	
	//	Action Listener Methods
	public void actionPerformed(ActionEvent event)
	{
		JOptionPane.showMessageDialog(null, "Ok pressed!");
	}
}
