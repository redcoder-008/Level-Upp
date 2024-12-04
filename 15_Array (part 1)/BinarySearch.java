public class BinarySearch {
    public static int binarysearch(int numbers[],int key)
    {
        int st=0;int end= numbers.length -1;
       while (st<=end)
       {
        int mid = (st+end)/2;
        if(numbers[mid]==key)
        {
            return mid;
        }
        if(numbers[mid]>key)
        {
            end=mid-1;
        }
        else {
          st=mid+1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8,9,10};
        int key=5;
        int ans= binarysearch(numbers,key);
        System.out.println( "Found at index :- "+ans);
    }
    
}
