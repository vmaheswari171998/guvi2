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
		char ch=sc.next()charAt(0);
		if(char=='a' || char=='e' || char=='i' || char=='o' || char=='u' char=='A' || char=='E' || char=='I' || char=='O' || char=='U')
		{
			System.out.println("Vowel");
		}
		else if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
		{
			System.out.println("consonant");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
