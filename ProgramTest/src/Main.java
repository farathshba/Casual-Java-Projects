import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main 
{	
	public static void main(String[] args)
	{
		ThreadOne thrOne = new ThreadOne(90);
		ThreadTwo thrTwo = new ThreadTwo(90);
		ExecutorService threadServ = Executors.newCachedThreadPool();
		threadServ.execute(thrOne);
		threadServ.execute(thrTwo);
		
		
	}
}
