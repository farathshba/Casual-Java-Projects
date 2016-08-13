
public class Datalog 
{
	//	-----------		Variables	-----------	//
	private static int number01, number02;
	
	//	-----------		Constructors	-----------	//
	//-----		Empty Constructor	-------
	public Datalog()
	{
		
	}
	
	//-----		Empty Constructor	-------
	public Datalog(int num01, int num02)
	{
		this.number01 = num01;
		this.number02 = num02;
	}
	
	public void putAddedValue(int num01, int num02)
	{
		this.number01 = num01;
		this.number02 = num02;
	}
	
	public int getAddedValue()
	{
		return (number01 + number02);
	}
}
