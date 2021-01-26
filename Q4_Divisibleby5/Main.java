/*
    Problem statement : Accept one number and check whether is is divisible by 5 or not.
*/

import java.lang.*;
import java.util.*;

class Numbers
{
	public int iNo = 0;
	
	public Numbers(int iValue)
	{
		this.iNo = iValue;
	}
	
	boolean Divisible()
	{
		if((this.iNo % 5) == 0)
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
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue = sobj.nextInt();
		
		Numbers nobj = new Numbers(iValue);
		
		boolean iRet = nobj.Divisible();
		if(iRet == true)
		{
			System.out.println("Number is Divisible by 5");
		}
		else
		{
			System.out.println("Number is not Divisible by 5");	
		}
		
	}
}