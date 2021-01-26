/*
    Problem statement : Program to print 5 times Marvellous on screen.
*/

import java.lang.*;

class Display
{
	public void Print()
	{
		for(int iCnt = 1; iCnt <= 5; iCnt++)
		{
			System.out.println("Marvellous");
		}
	}
}

class Main
{
	public static void main(String args[])
	{
		Display obj = new Display();
		
		obj.Print();
	}	
}