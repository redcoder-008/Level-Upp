public class Q8 {
    public static int lastOccurance(int arr[],int i,int tar)
    {
        if(i==arr.length ) return -1;
        int isFound = lastOccurance(arr, i+1, tar);
        if(isFound==-1 && arr[i]==tar) return i;
        return isFound;     
    }
    public static void main(String[] args) {
        int arr[]={3,3,2,45,2,6,2};
        System.out.println(lastOccurance(arr, 0, 2));
    }
}
