import java.util.*;

public class Main 
{	
	public static void main(String[] args)
	{
		ArrayList<String> arraylist = new ArrayList<String>();	
		Scanner input = new Scanner(System.in);
		int size = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter a String >> ");
			arraylist.add(input.next());
			size = arraylist.size();
		}
		
		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				int result = arraylist.get(j).compareTo(arraylist.get(i));
				if (result < 0) 
				{
					String temp = arraylist.get(i);
					arraylist.set(i, arraylist.get(j));
					arraylist.set(j, temp);
					System.out.println("In loop! Size of " + size);
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(arraylist.get(i));
		}
	}
}
