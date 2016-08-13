import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Year_12_Q_3a 
{
	JFrame frame;
	int size = 50;
	
	public static void main(String[] args)
	{
		Year_12_Q_3a gui = new Year_12_Q_3a();
		gui.go();
	}
	
	public void go()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(500,500);
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
			Graphics g2 = (Graphics2D) g;
			g2.setColor(Color.blue);
			g2.fillOval(225, 225, size, size);
			
			if(size < 450)
				size++;
		}
	}
}
