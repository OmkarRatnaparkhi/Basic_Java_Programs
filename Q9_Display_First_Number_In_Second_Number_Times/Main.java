/*
    Problem statement :Accept two numbers from user and display first number in second
number of times.

Input : 12 5
Output : 12 12 12 12 12

Input : -2 3
Output : -2 -2 -2

Input : 21 -3
Output : 21 21 21

Input : -2 0
Output :
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Display(int iNo1, int iNo2)
	{
		int iCnt = 0;
		
		if(iNo2 < 0)
		{
			iNo2 = -iNo2;
		}
		
		for(iCnt = 1; iCnt <= iNo2; iCnt++)
		{
			System.out.print(iNo1+"\t");		
		}
	}
}

class Main
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner (System.in);
		
		int iValue1 = 0, iValue2 = 0;
		
		System.out.println("Enter the first number");
		iValue1 = sobj.nextInt();
		
		System.out.println("Enter the second number");
		iValue2 = sobj.nextInt();
			
		Pattern pobj = new Pattern();
		pobj.Display(iValue1,iValue2);	
	}
}