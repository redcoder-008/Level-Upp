public class SortedArrayToBST{
    class Node {
        int data;
        Node root;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node createBSt(int arr,int st,int end){
        if(st>end) return null;
        int mid= (st+end)/2;
        Node root= New Node (arr[mid]);
        root.left = createBSt(arr, st,mid-1);
        root.right= createBSt(arr,mid+1,end);
        return root;

    }

}