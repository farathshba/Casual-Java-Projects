
public class ThreadOne implements Runnable 
{
	int tmp;
	public ThreadOne(int test)
	{
		this.tmp = test;  
	}
	
	public void run()
	{
		try
		{
			for(int i=0; i < 20; i++)
			{
				System.out.println("ThreadOne responding!!");
				Thread.sleep(200);
			}
		}
		catch(Exception error)
		{
			
		}
	}
}
