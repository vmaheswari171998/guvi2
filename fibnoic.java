/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n, a = 0, b = 0, c = 1;
		 Scanner s = new Scanner(System.in);
		 n = s.nextInt();
		for(int i = 1; i <= n; i++)
		{
			a = b;
			 b = c;
			 c = a + b;
			 System.out.print(a+" ");
		}
	}	
}
