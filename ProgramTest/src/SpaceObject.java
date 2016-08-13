
public abstract class SpaceObject 
{
	private int x;
	
	public SpaceObject(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public abstract void sketch(int b);
}
