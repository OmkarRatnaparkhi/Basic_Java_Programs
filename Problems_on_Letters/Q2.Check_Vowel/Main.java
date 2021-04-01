/*
    Problem statement : Accept on character from user and check whether that character is vowel
(a,e,i,o,u) or not.
Input : E Output : TRUE
Input : d Output : FALSE
	
*/

import java.lang.*;
import java.util.*;


class Check
{
	public boolean ChkVowel(char cValue)
	{
		if(cValue=='A' || cValue=='E' || cValue=='I' || cValue=='O' || cValue=='U' || cValue=='a' || cValue=='e' || cValue=='i' || cValue=='o' || cValue=='u')
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
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the character");
		char cValue = sobj.next().charAt(0);

		Check cobj = new Check();
		boolean ret = cobj.ChkVowel(cValue);	
		if(ret == true)
		{
			System.out.println("Character is vowel");
		} 
		else
		{
			System.out.println("Character is not vowel");
		}	
	}
}