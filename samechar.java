/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new  Scanner(System.in);
		String wordA = sc.nextLine();
		String wordB = sc.nextLine();
		String common = "";
 
		for(int i=0;i<wordA.length();i++)
		{
    			for(int j=0;j<wordB.length();j++)
    			{
				if(wordA.charAt(i)==wordB.charAt(j))
        				{
				 common += wordA.charAt(i)+"";
				 break; 
        				}
    			}
		}
    		System.out.println(common);
	}
}
