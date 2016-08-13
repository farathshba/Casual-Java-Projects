import java.util.*;

public class RandomClass 
{
	//	Global Variables
	private static int ComputerGeneratedRandomNo = (int)(Math.random() * 1000);
	private static boolean NOT_MATCH_CASE = true;
	
	RandomClass(int guessingNumber)
	{
		//System.out.println("Computer Generated Number is " + ComputerGeneratedRandomNo);
		if(guessingNumber < ComputerGeneratedRandomNo)
		{
			System.out.println("Too Low!");
			NOT_MATCH_CASE = true;
		}
		else if(guessingNumber > ComputerGeneratedRandomNo)
		{
			System.out.println("Too High!");
			NOT_MATCH_CASE = true;
		}
		else if(guessingNumber == ComputerGeneratedRandomNo)
		{
			System.out.println("You got it!");
			NOT_MATCH_CASE = false;
		}
	}
	
	public static void main(String[] args)
	{
		//	Local Variables
		int Seed = 1000;
		int guessedNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess my number! It's between 1 and 1000.");
		while(NOT_MATCH_CASE)
		{
			System.out.print("Your guess : ");
			RandomClass randomclass = new RandomClass(input.nextInt());
		}
	}
}
