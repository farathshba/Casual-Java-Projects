
public class ThreadTwo implements Runnable 
{
	int tmp;
	public ThreadTwo(int x)
	{
		this.tmp = x;
	}
	
	public void run()
	{
		for(int i=0; i<20; i++){
		System.out.println("ThreadTwo responding!!");
		}
	}
}
