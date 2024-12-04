//check if the given array is sorted or not???
public class Q6{
    public static boolean isSOrted(int arr[],int i)
    {
        if(i==arr.length-1){return true;}
        if(arr[i]>arr[i+1] )return false;
        return isSOrted(arr, i+1);

    }
    public static void main(String[]args)
    { int arr[]={1,2,3,4,5};
    System.out.println(isSOrted(arr, 0));

    }
}