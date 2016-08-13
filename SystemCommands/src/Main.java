/*
 * I modified this program to the extent of creating a very simply command prompt where it would get the 
 * commands from the user instead and try to run it. 
 * 
 * There was an challenge to this. What if the commands doesn't exist in the Operating System's environment and the
 * path variables aren't setted? These are some techniques which i used to over that issues.
 * 
 */

import java.io.*; 
import java.util.*;

public class Main 
{ 
	//	This method returns the String, "netstat"
	public static String displayNetworkConfig()
	{
		System.out.println("************* Processing **************");
		return "netstat";
	}

	//	This method returns the String, "ipconfig"
	public static String displayIP()
	{
		System.out.println("************* Processing **************");
		return "ipconfig";
	}
	
	//	This method returns the String, "ping " followed by to the name of the "webpage"
	public static String testConnectivity()
	{
		System.out.print("\n\nEnter the URL of the webpage you would like to test: ");
		System.out.println("************* Processing **************");
		return "ping " + new Scanner(System.in).next();
	}
	
	public static void main(String args[]) 
	{ 
		boolean continuerBool = true;
		int continuerInt = -1;
		String cmd = "";
		int netCmd = -1;
		
		//	This loop controls the main repetition of the main execution of the program
		while(continuerBool)
		{
			System.out.println("Select the following commands and enter their number ONLY.");
			System.out.println("0 - Display the network connections");
			System.out.println("1 - Display the IP Address Information");
			System.out.println("2 - Test the connectivity to a certain webpage");
			System.out.print(" >> ");
			
			//	Asks for the choice and executes the chosen command
			netCmd = new Scanner(System.in).nextInt();
			switch(netCmd)
			{
				case 0: cmd = displayNetworkConfig(); break;
				case 1: cmd = displayIP(); break;
				case 2: cmd = testConnectivity(); break;
				default: break;
			}
			
			try 
			{
				/*
				 * 	Gets the command in the String data-type and passes it to the Process outside of the 
				 * 	program's context to the environment of the Operating Systems' internal processes
				 */
				
				Process p=Runtime.getRuntime().exec(cmd); 
				p.waitFor(); 	//	This command allows the program to await for the external program to be completed
				BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 	//	Registration of BufferedReader
				String line=reader.readLine(); 		//	Gets the printed lines from the command prompt
				
				//	Prints out the contents of the command prompt onto the screen
				while(line!=null) 				
				{ 
					System.out.println(line); 
					line=reader.readLine(); 
				} 
				
			} 
			catch(IOException e1)
			{
				System.out.println("Error reading!");
			} 
			catch(InterruptedException e2) 
			{
				System.out.println("Error with command!");
			} 
			
			System.out.println("Do you want to continue: \nEnter '0' to exit and '1' to continue.");
			continuerInt = new Scanner(System.in).nextInt();
			if(continuerInt == 1)
			{
				continuerBool = true;
			}
			else if(continuerInt == 0)
			{
				continuerBool = false;
				break;
			}
		}
		System.out.println("Network Analysis Program ended.");
	} 
} 