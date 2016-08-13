
// This is a class itself
public class Main 
{
	//	This indicates the main method itself
	public static void main(String[] args)
	{
		int number01 = 2, number02 = 4;
		
		//	The object instance is been invoked over here with the local variables
		//	passed to the constructor
		Calculator calc = new Calculator(number01, number02);
		
		//	To print out the variables from the classes itself
		System.out.println("The number 01 holds " + calc.num01);
		System.out.println("The number 01 holds " + calc.num02);
		
		//	I am trying to call out the method from the class itself
		//	Note the "syntax"
		System.out.println("The added value holds " + calc.adder());
	}
}
