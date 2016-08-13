
public class Constructor 
{
	//	Global Variables
	private static double length, width;
	
	//	Constructor
	public Constructor(int len, int wid)
	{
		length = len;
		width = wid;
	}
	
	//	Methods
	public static double computeArea()
	{
		return length*width;
	}
	
	//	Main Method
	public static void main(String[] args)
	{
		Constructor construct = new Constructor(3, 5);
		System.out.println(construct.computeArea());
		
	}
}
