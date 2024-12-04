public class Q7 {
    public static int lastOccurence(int arr[],int i,int tar)
    {
        if(i==arr.length-1) return -1;
        if(arr[i]==tar ) return i;
        return lastOccurence(arr, i+1, tar);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,5,6,3};
        System.out.println(lastOccurence(arr, 0, 6));
    }
}
