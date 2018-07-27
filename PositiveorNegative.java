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
		System.out.println("Enter a value");
		int a=sc.nextInt();
		if(a=0)
		{
			System.out.println("Zero");
		}
		else if(a>0)
		{
			System.out.printl("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}
}
