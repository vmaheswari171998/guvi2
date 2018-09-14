import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String[] s=str1.split(" ");
		String temp=s[0];
		s[0]=s[1];
		s[1]=temp;
		System.out.println(s[0]+" "+s[1]);
	}
}
