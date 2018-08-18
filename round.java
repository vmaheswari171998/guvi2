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
		double myNum =sc.nextDouble();
		int precision = 10000; //keep 4 digits
		int my= Math.floor(myNum * precision +.5)/precision;	
		System.out.println(my);
	}
}
