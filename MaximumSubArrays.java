import java.util.Scanner;

public class MaximumSubArrays{

    public static int maximum(int arr[],int n,int b) {

        int max=0;
        for(int i=0;i<n;i++) {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum<=b && sum >max)
                {
                    max=sum;
                }
            }
        }
        return max;


    }

    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        int n=A.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=A.nextInt();
        }
        int c =A.nextInt();
        int value=maximum(arr,n,c);
        System.out.println(value);
    }
}