package Executing;

import com.local.helpers.FileReadWrite;

public class Executable 
{
	public static void main(String args[])
	{
		String file = "D:\\Documents\\GitHub\\Java-Projects\\HelloWorld\\src\\index.htm";
		String temp = FileReadWrite.storeFileIntoString(file);
		
		System.out.println(temp);
	}
}
