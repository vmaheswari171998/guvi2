/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int odd=0,rem,digit;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=sc.nextInt();
		while(num>0)
		{
			digit=num %10;
			num=num/10;
			rem=digit %2;
			if(rem !=0)
				System.out.print(digit+"\t");
		}
	}
}
