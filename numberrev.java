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
		int num=sc.nextInt();
		int rev=0;
		while(num != 0)
		{
			int digit = num % 10;
            		rev = rev * 10 + digit;
			 num /= 10;
		}
		System.out.println(rev);
	}
}
