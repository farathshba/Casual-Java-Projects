import javax.swing.*;
import java.awt.*;

public class frame extends JFrame
{
	private static int _HORIZONTAL_SIZE = 400;
	private static int _VERTICAL_SIZE = 200;
	
	public frame()
	{
		panel pan = new panel();
		pan.setButtonText("Ok");
		add(pan, BorderLayout.SOUTH);
		
		//add(new panel(), BorderLayout.SOUTH);
		setSize(_HORIZONTAL_SIZE, _VERTICAL_SIZE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
	}
	
	public static void main(String[] args)
	{
		frame fr = new frame();
		fr.setVisible(true);
	}
}
