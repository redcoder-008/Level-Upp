public class MergeSort {
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) return; // Base case: single element or invalid range
        
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);     // Sort the first half
        mergesort(arr, mid + 1, ei); // Sort the second half
        
        merge(arr, si, mid, ei);    // Merge the two sorted halves
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;        // Index for the 1st sorted part
        int j = mid + 1;   // Index for the 2nd sorted part
        int k = 0;         // Index for temp array

        // Merge the two sorted parts
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the first half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the second half (if any)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back the sorted elements into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 3, 2, 7, 4, 1};
        mergesort(arr, 0, arr.length - 1); // Pass correct end index
        printarray(arr);
    }
}
