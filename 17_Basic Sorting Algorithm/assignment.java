public class assignment {
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int currMin=i;
            for(int currItem=i+1;currItem<arr.length;currItem++)
            {
                if(arr[currItem]<arr[currMin])
                {
                    currMin= currItem;
                }
            }
            //swap
            
            {
                int temp= arr[currMin];
                arr[currMin]=arr[i];
                arr[i]=temp;
            }
        }
        }
        public static void insertionSort(int arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
                int j=i;
                while(j>0 && arr[j]>arr[j-1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            }
        }

        public static void main(String[] args) {
            int arr[]={3,6,2,1,8,7,4,5};
            insertionSort(arr);
            printArray(arr);
            
        }
    }
    


