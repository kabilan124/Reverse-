package LeadersArray;

import java.util.Scanner;

public class Leaders {
    public static void printLeaders(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        printLeaders(arr, n);
    }
}
