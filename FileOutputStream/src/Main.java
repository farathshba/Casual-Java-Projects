import java.io.*;


public class Main 
{
	public static void main(String[] args)
	{
		try
		{
			//	PrintWriter fileWrt = new PrintWriter(new File("File.txt"));
			File file = new File("File.csv");
			if(file.exists())
			{
				PrintWriter fileWrt = new PrintWriter(file);
				
				fileWrt.print("\"" + "column1" + "\",");
				fileWrt.print("\"" + "column2" + "\",");
				fileWrt.print("\"" + "column1" + "\"");
				fileWrt.print("\n");
				
				fileWrt.close();
			}
			//	PrintWriter fileWrt = new PrintWriter("File.csv");
			//	fileWrt.println("The quick brown fox jumps over the lazy dog");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File is not found.");
		}
		catch(IOException IOex)
		{
			System.out.println("IO Dishandle problem.");
		}
	}
}
