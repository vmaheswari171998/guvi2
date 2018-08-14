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
		int low=sc.nextInt();
		int high=sc.nextInt();

		 for(int number = low + 1; number < high; ++number)
		{
            		int digits = 0;
            		int result = 0;
            		int originalNumber = number;
            		while (originalNumber != 0)
            		{
            			originalNumber /= 10;
            			++digits;
			 }

            		originalNumber = number;
            		while (originalNumber != 0)
            			{
            				int remainder = originalNumber % 10;
            				result += Math.pow(remainder, digits);
            				originalNumber /= 10;
            			}

            			if (result == number)
            			System.out.print(number + " ");
		}		
	}
}
