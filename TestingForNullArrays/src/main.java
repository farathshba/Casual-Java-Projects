import java.util.Scanner;


public class main 
{
	public static void main(String[] main)
	{
		Scanner input = new Scanner(System.in);
		int[] array = new int[3];
		
		for(int zeroSearcher = 0; zeroSearcher < 3; zeroSearcher++)
		{
			if(array[zeroSearcher] == 0)
			{
				System.out.println("Zero found in the " + zeroSearcher + " index.");
			}
		}
		
		System.out.println("Please enter three numbers");
		for(int index = 0; index < 3; index++)
		{
			System.out.print(" >> ");
			array[index] = input.nextInt();
		}
		
		for(int zeroSearcher = 0; zeroSearcher < 3; zeroSearcher++)
		{
			if(array[zeroSearcher] == 0)
			{
				System.out.println("Zero found in the " + zeroSearcher + " index.");
			}
		}
	}
}
