/*
    Problem statement : Accept one character from user and convert case of that character.
Input : a Output : A
Input : D Output : d
	
*/

import java.lang.*;
import java.util.*;


class Convert
{
	public void convert(char cValue)
	{	
		char ch;
		if(cValue >= 'A' && cValue <= 'Z')
		{
			System.out.println(ch = Character.toLowerCase(cValue));
		}
		else if(cValue>='a'&&cValue<='z')
		{
			System.out.println( ch = Character.toUpperCase(cValue));
		}	
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the character");
		char cValue = sobj.next().charAt(0);

		Convert cobj = new Convert();
		cobj.convert(cValue);	
		
	}
}