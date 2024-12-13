public class BackTrackingArray{
    public static void  bcktrack(int arr[],int i,int val)
    {
        if(i==arr.length)
        {
            return;
        }
        arr[i]= val;
        bcktrack(arr, i+1, 1);
        arr[i]= arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]= new int [5];
        bcktrack(arr, 0, 1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(arr[i]);
            
        }
        
    }
}