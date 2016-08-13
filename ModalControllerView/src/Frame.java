import java.awt.FlowLayout;

import javax.swing.*;

public class Frame extends JFrame 
{
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	Frame(String labelText, String textFieldText, String buttonText)
	{
		this.label = new JLabel(labelText);
		this.textField = new JTextField(textFieldText);
		this.button = new JButton(buttonText);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(label);
		this.add(textField);
		this.add(button);
		this.setLocationRelativeTo(null);
		this.setSize(200, 550);
	}
}
