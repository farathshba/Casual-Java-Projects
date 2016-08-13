//	This is a class
public class Calculator 
{
	//	Variables used in the class
	public static int num01, num02;
	//	This is a constructor
	//	Always remember, constructor is used ONLY FOR assigning purposes.
	//	Computations are to be done in a method within the classes context.
	public Calculator(int numb01, int numb02)
	{
		num01 = numb01;
		num02 = numb02;
	}
	
	//	This is a method
	public static int adder()
	{
		return num01 + num02;
	}
}
