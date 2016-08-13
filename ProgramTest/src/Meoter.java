
public class Meoter extends SpaceObject 
{
	public Meoter(int a)
	{
		super(a);
	}
	
	public void sketch(int a)
	{
		System.out.println(this.getX() * a);
	}
	
	public static void main(String[] args)
	{
		Meoter meow = new Meoter(3);
		meow.sketch(5);
	}
}

