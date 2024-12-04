import java.util.Scanner;

class bs0 {
    public int search(int[] arr, int target) {
        int n = arr.length;

        int left = 0;
        int right = n-1;

        while(left < right){
            int mid = (left + right)/2;

            if(arr[mid] > arr[right]){ // should not possible 
                left = mid + 1;
            } else {
                right = mid;
            }
        }    // left == right

        int shift = left;

        left = 0;
        right = n-1;

        while(left <= right){
            int mid = (left+right)/2;

            int realMid = (mid + shift) % n;

            if(arr[realMid] == target){
                return realMid;
            } else if(arr[realMid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static int binarySearch(int[] arr, int target){
        int n = arr.length;


        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {5,11,14,19,30,35};

        System.out.println(binarySearch(arr,19));
    }
}