public class optimitizedBubblesort{
    public static void sort(int arr[])
{
    for(int turn=0;turn<arr.length-1;turn++)
    {
        boolean swap = false;
        for(int j=0;j<arr.length-1-turn;j++)
        { if(arr[j]>=arr[j+1])
            {

                int temp= arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
                swap= true;
            }
        }
        if(swap == false) break;
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
    int arr[]={2,1,5,3,7,2,7};
    sort(arr);
    printArray(arr);

}
}