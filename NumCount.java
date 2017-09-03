import java.util.*;
public class NumCount
{
    public static void main(String arg[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] str=st.split(" ");
        int[] num=new int[str.length];
        for(int i=0;i<str.length;i++)
            num[i]=Integer.parseInt(str[i]);
        Arrays.sort(num);
        for(int i=0;i<num.length;i+=count)
        {
            count=0;
            for(int j=i;j<num.length;j++) 
            {
            if(num[i]==num[j]) 
                count++;   
            else
             break;
            }
        System.out.println("The Number of "+num[i]+"'s  "+count);
        }
    }
}


