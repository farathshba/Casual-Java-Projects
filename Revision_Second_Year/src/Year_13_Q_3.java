import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Year_13_Q_3 
{
	JFrame frame;
	private int _yPosition;
	
	public static void main(String[] args)
	{
		Year_13_Q_3 sa = new Year_13_Q_3();
		sa.go();
	}
	
	public void go()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		while(true)
		{
			frame.repaint();
		}
	}
	
	public class MyDrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.blue);			
			
			if(_yPosition < 490)
			{
				g.fillRect(0, 0 + _yPosition, 50, 50);
				_yPosition++;
			}
		}
	}
}
