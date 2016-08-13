package com.local.helpers;

//	Importing of Java Libraries
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FileReadWrite 
{
	public static String storeFileIntoString(String file)
	{
		String temp = "";
		
		//	Read from file
		try
		{
			Scanner scanner = new Scanner(new File(file));
			//	temp.concat(scanner.next());
			
			while(scanner.hasNext())
			{
				temp = temp + scanner.next();
			}			
		}
		catch(IOException e)
		{
			System.err.println("I am!");
		}
		//	Write into String
		return temp;
	}
}
