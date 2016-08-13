
public class HP_Q3 
{
	public static int factorial(int number)
	{               
        int factorial = number;
       
        for(int i =(number - 1); i > 1; i--)
        {
        	factorial = factorial * i;
        }

        return factorial;
	}
	
	public static void main(String[] args)
	{
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(num));
	}
}
