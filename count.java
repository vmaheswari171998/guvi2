/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		int r=0;
		while(a !=0)
		{
			r=a/10;
			++count;
			a=a/10;
		}
		System.out.println(count);
	}
}
