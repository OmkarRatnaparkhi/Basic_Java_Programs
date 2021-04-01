/*
    Problem statement : Write a program which accept one number from user and print that number of
even numbers on screen.
Input : 7
Output: 2 4 6 8 10 12 14
*/

import java.lang.*;
import java.util.*;

class Numbers
{
	public void Display(int iNo)
	{
		int iCnt = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		if(iNo == 0)
		{
			System.out.println("Invalid Input");
		}		
		
		for(iCnt = 2; iCnt <= (iNo*2);iCnt++)
		{
			if((iCnt % 2) == 0)
			{
				System.out.print(iCnt + " ");
			}
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
		
		Numbers nobj = new Numbers();
		
		nobj.Display(iValue);
		
	}
}