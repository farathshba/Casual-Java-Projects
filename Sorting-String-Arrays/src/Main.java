import java.util.*;

public class Main 
{
	public static String getString()
	{
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> input = new ArrayList<String>();
		
		for(int count = 0; count < 5; count++)
		{
			System.out.print("Enter your NRIC : ");
			input.add(getString());
		}
		
		Collections.sort(input);
		for(int count = 0; count <= input.size()+1; count++)
		{
			System.out.println("NRIC : " + input.get(count));
		}
	}
}
