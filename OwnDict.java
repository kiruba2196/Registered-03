import java.util.Arrays;
import java.util.Scanner;

public class OwnDict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		StringBuffer sb=new StringBuffer(st);
		while(!st.endsWith("EOF"))
		{
			st=String.valueOf(sb.append(sc.nextLine()));
			continue;
		}
		String pro=String .valueOf(sb).toLowerCase();
		String[] arr=pro.split(" ");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		
	}

}
