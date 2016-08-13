import java.util.*;

public class HP_Q2 
{
	static ArrayList<Integer> storage = new ArrayList<Integer>();
	
	public static void populateArrayList(int limit)
	{
		storage.add(0);
		storage.add(1);
		
		while(storage.get(storage.size()-1) > limit)
		{
			storage.add(storage.get(storage.size()-1 + storage.size() -2));
		}
	}
	
	public static int sumOfOddFibonacciSeq()
	{
		int sum=0;
		int index = 0;
		if(storage.size()%2 != 0)
		{
			for(int i=0; i<storage.size()/2; i++)
			{
				sum = sum + storage.get(index);
				index = index + 2;
			}
		}
		else
		{
			for(int i=0; i<storage.size()/2; i++)
			{
				sum = sum + storage.get(index);
				index = index + 2;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		populateArrayList(100);
		System.out.println(sumOfOddFibonacciSeq());
	}
}
