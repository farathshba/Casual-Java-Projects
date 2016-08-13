import javax.swing.*;
import java.awt.*;

public class panel extends JPanel 
{
	private JButton button;
	public panel()
	{
		button = new JButton();
		
		//	Adding listeners to the components
		Control controllerAction = new Control();
		button.addActionListener(controllerAction);
		
		this.add(button);
	}
	
	public void setButtonText(String buttonText)
	{
		this.button.setText(buttonText);
	}
}
