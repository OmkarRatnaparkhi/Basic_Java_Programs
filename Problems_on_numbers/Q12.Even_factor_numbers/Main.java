/*
    Problem statement : Write a program which accept number from user and print even factors of that
number.
Input : 24
Output: 1 2 4 6 8 12
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
		
		if(iNo==0)
		{
			System.out.println("Invalid Input");
		}
		
		for(iCnt = 1; iCnt <= iNo/2; iCnt++)
		{
			if(((iNo%iCnt)==0) && ((iCnt%2)==0))
			{
				System.out.print(iCnt +"\t");
			}
			
		}
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue = sobj.nextInt();
		
		Numbers nobj = new Numbers();
		
		nobj.Display(iValue);
		
	}
}