/*
    Problem statement : Program to print 5 to 1 numbers on screen.
*/

import java.lang.*;

class Display
{
	public void PrintNo()
	{
		for(int iCnt = 5; iCnt >= 1; iCnt--)
		{
			System.out.println(+iCnt);
		}
	}
}

class Main
{
	public static void main(String args[])
	{
		Display obj = new Display();
		
		obj.PrintNo();
	}
}