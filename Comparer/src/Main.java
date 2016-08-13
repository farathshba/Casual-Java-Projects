import java.util.*;

public class Main 
{
	public static char getString()
	{
		return new Scanner(System.in).; 
	}
	
	public static void main(String[] args)
	{
		char[] myarray = new char[5];
		System.out.print("Enter Char A : ");
		char CharA = getString();
		
		System.out.print("Enter String B : ");
		String StrB = getString();
		
		if(StrA.charAt(0) > StrB.charAt(0))
		{
			System.out.println(StrA.charAt(0) + " IS BIGGER THAN " + StrB.charAt(0));
		}
		else if(StrA.charAt(0) < StrB.charAt(0))
		{
			System.out.println(StrA.charAt(0) + " IS SMALLER THAN " + StrB.charAt(0));
		}
	}
}
