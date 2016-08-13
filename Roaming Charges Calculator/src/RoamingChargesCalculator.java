import java.util.Scanner;
import java.util.ArrayList;

public class RoamingChargesCalculator 
{
	//	Global Dynamic Array which is used to store the Objects
	static ArrayList<Container> object = new ArrayList<Container>();
	
	//	----------	Main Program	----------	//
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		
		System.out.println("***********Roaming Charges Calculator********");
		System.out.println("1: Calculate International Call Expenditure");
		System.out.println("2: Display Total Expenditure");
		System.out.println("3: Exit");
		System.out.println("****************************************************");
				
		System.out.print("Please enter your choice: ");
		int choice = input.nextInt();
		
		//	Looping till the user presses choice '3', which terminates the program instance
		while(true)
		{
			switch(choice)
			{
				case 1:	 choiceOne(); break;
				case 2:	 choiceTwo(); break;
				case 3:  choiceThree(); break;
				
				default: break;
			}
			
			System.out.print("Please enter your choice: ");
			choice = input.nextInt();
		}
	}
	
	//	----------	Methods which corresponds to the choices	----------	//
	
	//	Method that corresponds to choice '1'
	public static void choiceOne()
	{
		//	Variables initialization
		Scanner input = new Scanner(System.in);
		int numberOfCalls, numberOfMinutes; 
		String destName;
		double costPerMinute;
		char confirmation;
		
		//	Prompt for the number of calls
		System.out.print("Please enter number of calls made:");
		numberOfCalls = input.nextInt();
		
		//	Loop till the number of calls' datum are entered into respective variables and stored as 'objects' in Dynamic Array (ArrayList)
		for(int count = 0; count < numberOfCalls; count++)
		{
			System.out.println("Please enter call destination " + (count+1));
			System.out.print("Destination " +  (count+1) + "'s name is : ");
			destName = input.next();
			System.out.print("Cost per minute is : ");
			costPerMinute = input.nextDouble();
			System.out.print("Please enter the number of minute called : ");
			numberOfMinutes = input.nextInt();
			System.out.print("Please confirm(Y/N) : ");
			confirmation = input.next().charAt(0);
			
			//	If the user had confirmed the details, show them for confirmation
			if(confirmation == 'y' | confirmation == 'Y')
			{
				System.out.println("Please enter call destination " + (count+1));
				System.out.println("Destination " + (count+1) + "'s name is : " + destName);
				System.out.println("Cost per minute is : " + costPerMinute);
				System.out.println("Please enter the number of minute called : " + numberOfMinutes);
				System.out.println("Please confirm(Y/N) : " + confirmation);
				
				System.out.println("Cost for destination " + (count+1) + " is =    >>>>>$" + (costPerMinute * numberOfMinutes) + "<<<<< ");
				
				object.add(new Container(numberOfCalls, numberOfMinutes, destName, costPerMinute, costPerMinute*numberOfMinutes));
			}
			else
			{
				count--;
				System.out.println("Please re-enter >> ");
				continue;
			}
		}
		System.out.println();
	}
	
	//	Method that corresponds to choice '2'
	public static void choiceTwo()
	{
		//	Variables initialization
		double totalRoamingCharges = 0;
		System.out.println("Display Item's Individual Cost  & Total Cost");
		System.out.println("==============================");
		
		//	Accumulation of the total costs
		for(int count = 1; count <= object.size(); count++)
		{
			totalRoamingCharges = totalRoamingCharges + object.get(count-1).getTotalCallsCost();
			System.out.println("Cost of item " + count + " " + object.get(count-1).getDestName() + " is : $ " + object.get(count-1).getTotalCallsCost());
		}
		
		//	Printing out of the accumulated costs
		System.out.print("Total Roaming Charge is =>>>>>>$");
		System.out.printf("%.2f", totalRoamingCharges);
		System.out.print("<<<<<");
		
		System.out.println();
	}
	
	//	Method that corresponds to choice '3'
	public static void choiceThree()
	{
		System.out.println("Thank you for using Roaming Charges Calculator.");
		System.exit(0);
	}
}
