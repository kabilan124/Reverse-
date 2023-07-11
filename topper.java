package Topper;
import java.util.*;
public class Topper
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int regnum=sc.nextInt();
        int num=regnum;
        int count=0;
        int odd=0;
        int even=0;
        while(num>0)
        {
            count=num%10;
            if(count%2==0)
            {
                even=even+count;
            }
            else
                odd=odd+count;
            num/=10;
        }
        if(even==odd)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }


    }
}
