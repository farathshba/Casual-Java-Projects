import java.io.*;

public class Year_13_Q_6 implements Serializable 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fo = new FileOutputStream("MyObject.ser");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		os.writeObject(obj)
	}
}
