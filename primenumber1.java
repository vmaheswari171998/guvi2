/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int m=0;
		for(int i=n+1;i<k;i++)
		{
			int l=0;
			for(int j=l;j<=i;j++)
			{
				if(i%j==0)
				{
					l++;
				}
			}
			if(l==2)
			{
				if(m<l)
				{
					System.out.println(i);
				}
				else
				{
					System.out.println(" ");
					System.out.println(i);
				}
				m++;
			}
		}
	}
}
