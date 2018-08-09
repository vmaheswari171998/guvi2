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
		int q=sc.nextInt();
		int count=0,i=0,j=0;
		j=n+1;
		while(j<q)
		{
			count=0;
			for(i=2;i<=j/2;++i)
			{
				if(j%i==0)
				{
					count=1;
					break;
				}
			}
			if(count==0)
				System.out.print(j+" ");
			j++;
		}
			
	}
}
