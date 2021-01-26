/*
    Problem statement : Accept two numebrs from user and return its division.
*/

/*
Algorithm
	START
		Accept first number from user as no1 
		Accept second number from user as no2
		Create one ans variable
		Divide no1(dividend) number by no2(divisor)
		Store the quotient/result in ans
		return the value from ans
	END 
 */

import java.lang.*;
import java.util.*;
import Marvellous.Maths;

class Main
{
	public static void main(String args[])
	{
		int iValue1 = 0, iValue2 = 0, iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		iValue1 = sobj.nextInt();
		System.out.println("Enter First Number");
		iValue2 = sobj.nextInt();
		
		Maths mobj = new Maths();
		iRet = mobj.Division(iValue1,iValue2);
		System.out.println("Division is: "+iRet);
	}
}