
public class PrimeDetect 
{
	public static void PrimeDetect(int number)
	{
		boolean[] array = new boolean[3];
		
		for(int counter = number; counter > 0; counter--)
		{
			//	System.out.println(counter);
			if (counter == number)
			{
				if (number % counter == 0)
					array[0] = true;
				else
					array[0] = false;
			}
			else if ((counter != number) && (counter != 1))
			{
				if (number % counter != 0)
					array[1] = true;
				else
					array[1] = false;	
			}
			else if (counter == 1)
			{
				if (number % counter == 0)
					array[2] = true;
				else
					array[2] = false;
			}
		}
		
		System.out.println(array[0] && array[1] && array[2]);
	}
}
