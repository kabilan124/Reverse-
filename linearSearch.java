public class linearSearch {
    public static void main(String[] args) {
        //Linear search
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(checkOccurence(array,B));
    }
    public static int checkOccurence(int array[],int B)
    {
        int count = 0;
        for(int i=0;i< array.length;i++)//the overall time complexity of the code is O(N)
        {
            if(array[i] == B)
            {
                count++;
            }
        }
        return count;
    }
}