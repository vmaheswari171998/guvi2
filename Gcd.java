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
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=0;
		for(int i = 1; i <= n1 && i <= n2; ++i)
		{
			if(n1 % i==0 && n2 % i==0)
            		 gcd = i;
		}
		System.out.println(gcd);
	}
}
