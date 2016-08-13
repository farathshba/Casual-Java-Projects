import java.util.*;

public class Main 
{
	public static int getInt()
	{
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static void main(String[] args)
	{
		Class[] myarray = new Class[5];
		
		//	variables used for Bubble Sort
		boolean loop = true;
		int temp;
		
		//	Read in the objects and store them in Arrays
		for(int count = 0; count < 5; count++)
		{
			Class class01;
			System.out.print(" >> ");
			myarray[count] = new Class(getInt());
		}
		
		//	Sort the array based on Bubble Sort
		while(loop)
		{
			loop = false;
			for(int count = 0; count < myarray.length; count++)
			{
				//System.out.println("Size of myarray : " + myarray.length);
				//System.out.println("Size of count+1 : " + (count+1));
				if(myarray.length > (count+1))
				{
					if(myarray[count].getVariable() > myarray[(count+1)].getVariable())
					{
						temp = myarray[count].getVariable();
						myarray[count].putVariable(myarray[(count+1)].getVariable());
						myarray[(count+1)].putVariable(temp);
						loop = true;
					}
				}
			}
		}
		
		//	Print the contents of the objects from the arrays
		for(int count = 0; count < 5; count++)
		{
			Class class01 = myarray[count];
			System.out.println("Array #" + count + " : " + class01.getVariable());
		}
	}
}
