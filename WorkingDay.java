import java.util.Scanner;

public class WorkingDay {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		if(st.equalsIgnoreCase("Monday") || st.equalsIgnoreCase("Tuesday") || st.equalsIgnoreCase("Wednesday") || st.equalsIgnoreCase("Thursday") || st.equalsIgnoreCase("Friday"))
		{
			System.out.println("True");
		}
		else if(st.equalsIgnoreCase("Saturday") || st.equalsIgnoreCase("Sunday"))	
		{
			System.out.println("False");
		}
	}

}
