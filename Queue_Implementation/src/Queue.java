import java.util.*;
public class Queue 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> queue = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Keep entering followed by a space but if you wish to exit, press the E");
		
		while(!input.hasNext("E"))
		{
			String temp = input.nextLine();
			String[] tempArr = temp.split(" ");
			
			for(int count=0; count<tempArr.length; count++)
			{
				queue.add(Integer.parseInt(tempArr[count]));
			}
		}
		
		bubblesrt(queue);
	}
	
	public static void bubblesrt(ArrayList<Integer> list)
	  {
	        Integer temp;
	        if (list.size()>1) // check if the number of orders is larger than 1
	        {
	            for (int x=0; x<list.size()-1; x++) // bubble sort outer loop
	            {
	                for (int i=0; i < list.size()-i; i++) {
	                    if (list.get(i).compareTo(list.get(i+1)) > 0)
	                    {
	                        temp = list.get(i);
	                        list.set(i,list.get(i+1) );
	                        list.set(i+1, temp);
	                    }
	                }
	            }
	        }

	  }
}
