import java.util.*;

public class Main 
{
	public static void main(String[] main)
	{
		int firstNo, secondNo;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter first number : ");
		firstNo = input.nextInt();
		
		System.out.print("Please enter second number : ");
		secondNo = input.nextInt();
		
		math.Add(firstNo, secondNo);
		
		System.out.println("The added value is " + new Datalog().getAddedValue());
	}
}
