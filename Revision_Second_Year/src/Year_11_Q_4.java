import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Year_11_Q_4 extends JFrame
{
	private ColourCircle cir = new ColourCircle();
	private JButton button = new JButton("Blue circle above");
	
	public Year_11_Q_4()
	{
		this.setTitle("Question Four");
		this.setSize(400, 400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.add(cir, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		Year_11_Q_4 frame = new Year_11_Q_4();
	}
	
	public class ColourCircle extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawOval(125, 125, 150, 150);
			g.setColor(Color.blue);
			g.fillOval(125, 125, 150, 150);
		}
	}
}
