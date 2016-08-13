import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Frame extends JFrame
{
	private JPanel panelOne = new JPanel();
	private JPanel panelSecond = new JPanel();
	private JPanel panelThree = new JPanel();
	private JPanel panelFour = new JPanel();
	
	private JPanel innerPanelOne = new JPanel(new GridLayout(3,1));
	private JPanel innerPanelTwo = new JPanel(new GridLayout(4,1));
	
	private JLabel labelOne = new JLabel("Enter search string");
	private JTextField textFieldOne = new JTextField(12);
	private JButton button = new JButton("Ok");
	
	private JCheckBox checkbox01 = new JCheckBox("Barcode");
	private JCheckBox checkbox02 = new JCheckBox("Name");
	private JCheckBox checkbox03 = new JCheckBox("Category");
	private JCheckBox checkbox04 = new JCheckBox("Manufacturer");
	
	public Frame(String t)
	{
		this.setTitle(t);
		this.setSize(600, 400);
		this.setLayout(new GridLayout(2,2));
		
		this.add(panelOne);
		this.panelOne.setBorder(new TitledBorder("Search"));
		this.add(panelSecond);
		this.add(panelThree);
		this.add(panelFour);
		
		this.panelOne.add(innerPanelOne);
		this.panelOne.add(innerPanelTwo);
		
		this.innerPanelOne.add(labelOne);
		this.innerPanelOne.add(textFieldOne);
		this.innerPanelOne.add(button);
		
		this.innerPanelTwo.add(checkbox01);
		this.innerPanelTwo.add(checkbox02);
		this.innerPanelTwo.add(checkbox03);
		this.innerPanelTwo.add(checkbox04);
	}
}
