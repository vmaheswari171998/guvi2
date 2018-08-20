import java.util.Scanner;
class SumofAP {
public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
    System.out.print(n*(2*a+(n-1)*d)/2);
    }
}
