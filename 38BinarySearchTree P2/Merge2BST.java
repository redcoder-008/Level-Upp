import java.lang.reflect.Array;
import java.util.ArrayList;

public class Merge2BST {
    static class Node {
        Node left, right;
        int data;

        Node(int val) {
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> array) {
        if (root == null)
            return;
        inorder(root.left, array);
        array.add(root.data);
        inorder(root.right, array);
    }

    public static Node merge(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);
        // merge
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                finalarr.add(arr1.get(i));
                i++;
            } else {
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;

        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.right = new Node(4);
        root1.left = new Node(1);
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        merge(root1, root2);
        System.out.println(Array.get(1));
    }

}
