public class quickSort {
    public static void quicksort(int arr[],int si,int ei)
    {
        if(si>=ei) return;
        //last element
        int pIdx= partion(arr,si,ei);
        quicksort(arr, si, pIdx-1); //left
        quicksort(arr, pIdx+1, ei); // right
    }
    public static int partion(int arr[],int si,int ei)
    {
        int pivot = arr[ei];
        int i= si-1; //to make place of elements smaller than pivot
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                //swap
                int temp= arr[j];
                arr[j]= arr[i];
                arr[i]= temp;

            }

        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]= temp;
        return i;
    }
    public static void printArray(int arr[])
    {  for(int i=0;i<arr.length;i++){ 
        System.out.print(arr[i]+" ");
    }
    }
public static void main(String[] args) {
    int arr[]={4,3,5,9,1,2};
    quicksort(arr, 0, arr.length-1);
    printArray(arr);
}
    
}
