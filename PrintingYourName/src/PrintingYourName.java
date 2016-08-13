
public class PrintingYourName 
{
	public static void main(String[] args)
	{
		//	Assign the following methods one-by-one
		//	TenTimes();
		// ThreeTimes();
		// HundredTimes();
		thousandsTimes();
	}
	
	//	Method to print my_name three times
	public static void ThreeTimes()
	{
		int i;
		for (i=0;i<3;i++)
		{
			System.out.println("Hello World!!");
		}
		System.out.println("The above statement is printed " + i + " times.");
	}
	
	// Method to print my_name ten times
	public static void TenTimes()
	{
		int i;
		for (i=0;i<10;i++)
		{
			System.out.println("Hello World!!");
		}
		System.out.println("The above statement is printed " + i + " times.");
	}
	
	// Method to print my_name Hundred times
	public static void HundredTimes()
	{
		int i=0;
		for(i=0;i<100;i++)
		{
			System.out.println("Hello World!!");
		}
		System.out.println("The above statement is printed " + i + " times.");
	}
	
	// Method to print my_name thousand times
	public static void thousandsTimes()
	{
		int i;
		for (i=0;i<1000;i++)
		{
			System.out.println("Hello World!!");
		}
		System.out.print("The above statement is printed " + i + " times.");
	}
}
