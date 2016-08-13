import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Frame 
{
	private JButton button = new JButton("Press me");
	
	public static void main(String[] args)
	{
		Frame gui = new Frame();
		gui.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		button.addActionListener(new ButtonListener());
		frame.add(button);
	}
	
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Hello fucker !!");
		}
	}
}
