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
		int n=sc.nextInt();
		int rev=0,n1=n;
		int rem;
		while(n !=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(n1==rev)
		
			System.out.println("Yes");
		
		else
		
			System.out.println("no");
		
	}
}
