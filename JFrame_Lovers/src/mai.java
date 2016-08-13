import javax.swing.JFrame;

public class mai extends JFrame  
{
	private int width = 250;
	private int len = 250;
	
	public mai()
	{
	}
	
	public void go()
	{
		this.setVisible(true);
		this.setSize(width, len);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Nalini");
		this.setLocationRelativeTo(null);
	}
	
}
