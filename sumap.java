/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
		int a, d, n;
		int sum = 0;
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		sum = (n * (2 * a + (n - 1) * d)) / 2;
		System.out.println(sum);
		
	}
	
}
