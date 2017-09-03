import java.util.Scanner;

public class Pramid {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
    	for(int k=0;k<(n-i);k++)
    		System.out.print(" ");
        for(int j=0;j<i; j++)
        {
            System.out.print("*");
        }
        for(int j=0;j<i-1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
	}
}
