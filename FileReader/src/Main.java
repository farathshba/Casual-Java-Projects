import java.util.*;
import java.io.*;

public class Main 
{
	public static void main(String[] main) throws FileNotFoundException
	{
		Scanner fileRdr = new Scanner(new File("Catalog.txt"));
		String[] keyArray;
		
		while(fileRdr.hasNextLine())
		{
			String firstLine = fileRdr.nextLine();
			
			keyArray = firstLine.split(", ");
			
			for(int i=0; i < keyArray.length; i++)
			{
				System.out.println(keyArray[i]);
			}
		}
	}
}
