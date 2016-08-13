
public class main 
{
	public static void main(String[] args)
	{
		String s = "6+5";

		try
		{
			if(Integer.parseInt(s) < 9)
				throw new Exception();
			System.out.println("Red");
		}
		catch(Exception e)
		{
			System.out.println("Black");
		}
	}
}
