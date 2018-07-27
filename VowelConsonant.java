/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char");
		char ch=sc.next().charAt(0);
		if(ch='a'||'e'||'i'||'o'||'u')
		{
			System.out.println(ch+"Vowel");
		}
		else
		{
			System.out.println(ch+"Consonant");
		}
	}
}
