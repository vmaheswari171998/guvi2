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
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+"is larger");
		}
		else if(a>c)
		{
			System.out.println(a+"is larger");
		}
		else
		{
			System.out.println(b+"is larger");
		}
	}
}
