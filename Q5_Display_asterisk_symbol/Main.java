/*
    Problem statement : Accept one number from user and print that number of * on screen.
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Display(int iNo)
	{
		for(int iCnt = 1; iCnt <= iNo ; iCnt++)
		{
			System.out.println("*");
		}
	}
}

class Main
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		
		pobj.Display(iValue);
	}
}