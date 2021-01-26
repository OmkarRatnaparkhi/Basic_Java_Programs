/*
    Problem statement : Accept one number from user and print that number of * on screen using while loop
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Display(int iNo)
	{
		int iCnt = 1;

		while(iCnt <= iNo)
		{
			System.out.print("*\t");
			iCnt++;
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
