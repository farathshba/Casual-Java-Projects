import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		int num01, num02;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		num01 = input.nextInt();
		System.out.println();
		System.out.print("Enter an integer : ");
		num02 = input.nextInt();
		
		arrayList arr = new arrayList(num01, num02);
		
		System.out.print("The number stored @ the first index is " + arr.arraylist.get(0));
		System.out.print("The number stored @ the second index is " + arr.arraylist.get(1));
	}
}
