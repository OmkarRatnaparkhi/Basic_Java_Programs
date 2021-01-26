/*
    Problem statement : Accept one number from user and print that number of * on screen using for loop
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Display(int iNo)
	{
		int iCnt = 0;
		
		for(iCnt = 1; iCnt <= iNo ; iCnt++)
		{
			System.out.print("*\t");
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
