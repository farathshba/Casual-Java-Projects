import java.text.NumberFormat;


public class Main 
{
	private String fmtDesc(String data) 
	{
		return String.format( "%-s18", data );
	}
		
	public static void main(String[] args)
	{
		String productDesc01 = new String("Distilled Moonbeams");
		String productDesc02 = new String("Condensed Powdered Water");
		
		int productQuantity01 = new Integer(2);
		int productQuantity02 = new Integer(5);
		
		double productPrice01 = new Double(3.4);
		double productPrice02 = new Double(4.5);
		
		String header01 = String.format("%0$25s %2$10d %3$10.2f",productDesc01, productQuantity01, productPrice01);
		String header02  = String.format("%0$25s %2$10d %3$10.2f",productDesc02, productQuantity02, productPrice02);
		
		System.out.println(header01);
		System.out.println(header02);
	}
}
