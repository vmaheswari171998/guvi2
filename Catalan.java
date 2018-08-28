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
        int[] t = new int[num + 2];
        t[1] = 1;
        for (int i = 1; i <= num; i++) {
 
            for (int j = i; j > 1; j--)
                t[j] = t[j] + t[j - 1];
 
            t[i + 1] = t[i];
            
            for (int j = i + 1; j > 1; j--)
                t[j] = t[j] + t[j - 1];
             System.out.printf("%d ", t[i + 1] - t[i]);
        }

	}
}
