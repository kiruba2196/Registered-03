import java.util.Scanner;

public class SumOfPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		String[] num=st.split("");
		int sum=0;
		for(int i=0;i<num.length-1;i++)
		{
			sum=sum+(int)(Math.pow(Integer.parseInt(num[i]),Integer.parseInt(num[i+1])));
		}
		sum=sum+(int)(Math.pow(Integer.parseInt(num[num.length-1]),Integer.parseInt(num[0])));
		System.out.println(sum);
	}

}
