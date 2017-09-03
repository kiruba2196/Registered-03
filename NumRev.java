import java.util.*;
public class NumRev
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String[] arr=inp.split(",");
        int len=arr.length;
        for(int i=0;i<len/2;i++)
        {
            System.out.print(arr[len-1-i]+","+arr[i]);
            if(i!=len/2-1)
            	System.out.print(",");
        }
        if(len%2==1)
        System.out.println(","+arr[(len/2)]);
    }
}
