public class bubblesort{
    public static void bubble(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)
            { int swap =0;
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap ++;
                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1,};
        System.out.print("Unsorted Array : ");
        printArray(arr);
        bubble(arr);
        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}