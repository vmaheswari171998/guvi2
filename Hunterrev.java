/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 String s;
	 Scanner ss=new Scanner(System.in);
	 s=ss.nextLine();
	 String a[]=s.split("\\s+");
	 for(int i=0;i<a.length;i++)
	 {
	 	String v=new StringBuffer(a[i]).reverse().toString();
		 System.out.printf("%s ", v);	
	 }
	}
}
	
