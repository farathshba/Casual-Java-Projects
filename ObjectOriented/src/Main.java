
public class Main 
{

	public static void main(String[]args)
	{
		DominoSet myDominos = new DominoSet();

		for(int j=0; j<28; j++)
		{
			System.out.println(myDominos.Hold[j].getLeft() + " " + myDominos.Hold[j].right);
		}
	}
}
