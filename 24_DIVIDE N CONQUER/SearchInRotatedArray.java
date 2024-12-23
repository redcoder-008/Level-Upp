public class SearchInRotatedArray {
    public static int search(int arr[],int tar,int si,int ei)
    {
        if(si>ei) return -1;
        int mid= si+(ei-si)/2;
        //case found
        if(arr[mid] == tar ) return mid;
        //mid on L1
        if(arr[si]<=arr[mid])
        {
            //case a : left
            if(arr[si] <=tar && tar<=arr[mid])
            {
                return search(arr, tar, si, mid-1);
            }
                else
                { //case b:right
                    return search(arr, tar, mid+1, ei);

                }
        
    }
    //MID ON LINE 2
    else{ 
            //case c: right
            if(arr[mid]<=tar && tar<=arr[ei])
            {
                return search(arr, tar, mid+1, ei);

            }
            else{ // case d: left
                return search(arr, tar, si, mid-1); /// 
            }

    }
    
}

public static void printArray(int arr[])
{ 
     for(int i=0;i<arr.length;i++){ 
    System.out.print(arr[i]+" ");
}}

public static void main(String[] args) {
    int arr[]={1,3,4,5,7,8,9};
    int tar = 8;
    int tarIdx= search(arr, tar, 0, arr.length-1);
   System.out.println(tarIdx);
}
}
    
