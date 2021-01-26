/*
    Problem statement : Accept on number from user if number is less than 10 then print
Hello otherwise print Demo.
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Display(int iNo)
	{
		if(iNo <= 10) 
		{
			System.out.println("Hello");			
		} 
		else 
		{ 
			System.out.println("Demo");
		}
	}
}

class Main
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner (System.in);
		
		int iValue = 0;
		
		System.out.println("Enter the number");
		iValue = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		pobj.Display(iValue);		
	}
}
