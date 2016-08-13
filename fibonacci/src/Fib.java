
public class Fib 
{
	public static void main(String[] args)
	{
		fib(0, 1, 8);
	}
	
	//	
	public static void fib(int first, int second, int size)
	{
		System.out.print("Fibonacci sequence : ");
		System.out.print(first + ", ");
		System.out.print(second + ", ");
		for(int s = 0; s < size-2; s++)
		{
			System.out.print((first+second) + ", ");
		}
	}
}
