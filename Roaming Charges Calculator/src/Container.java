/*	----------	This is a class that is used to tie up the discrete data obtained from the call costs 
and string them as one single object.
*/

public class Container
{
	int numberOfCalls;
	int numberOfMinutes;
	String destName;
	double costPerMinute, totalCallsCost;
	
	public Container(int numberOfCalls, int numberOfMinutes, String destName, double costPerMinute, double totalCallsCost)
	{
		this.numberOfCalls = numberOfCalls;
		this.numberOfMinutes = numberOfMinutes;
		this.destName = destName;
		this.costPerMinute = costPerMinute;
		this.totalCallsCost = totalCallsCost;
	}
	
	//	Accessor methods
	public int getNumberOfCalls()
	{
		return numberOfCalls;
	}
	
	public int getNumberOfMinutes()
	{
		return numberOfMinutes;
	}
	
	public String getDestName()
	{
		return destName;
	}
	
	public double getCostPerMinute()
	{
		return costPerMinute;
	}
	
	public double getTotalCallsCost()
	{
		return totalCallsCost;
	}
}