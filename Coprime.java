import java.util.Scanner;

public class Coprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		 for(int i=n; i<=m; i++)
		    {
		        for(int j=2;j<9; j++)
		        {
		            if(n%j==0)
		            	count++;
		        }
		    }
		    if(count==2)
		    	System.out.println("Co prime");
		    else
		    	System.out.println("Not Co prime");
	}

}
