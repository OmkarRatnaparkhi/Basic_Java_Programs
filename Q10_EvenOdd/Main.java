/*
    Problem statement :Accept number from user and check whether number is even or
odd.
*/

import java.lang.*;
import java.util.*;

class Numbers
{
	public boolean EvenOdd(int iNo)
	{
		if((iNo % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

class Main
{
	public static void main(String arg[])
	{
		Numbers nobj = new Numbers();
		Scanner sobj = new Scanner (System.in);
		
		System.out.println("Enter the number");
		int iValue = sobj.nextInt();
		
		boolean iRet = nobj.EvenOdd(iValue);
		if(iRet == true)
		{
			System.out.println(iValue+" number is EVEN");
		}
		else
		{
			System.out.println(iValue+" number is ODD");
		}
		
	}
}
