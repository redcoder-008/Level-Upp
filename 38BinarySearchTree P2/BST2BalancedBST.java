import java.util.ArrayList;

public class BST2BalancedBST {
    static class Node {
        Node left, right;
        int data;

        Node(int val) {
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> sarray) {
        if (root == null)
            return;
        inorder(root.left, sarray);
        sarray.add(root.data);
        inorder(root.right, sarray);
    }

    public static Node createBST(ArrayList<Integer> sarray, int st, int end) {
        if (st > end)
            return null;
        int mid = (st + end) / 2;
        Node root = new Node(sarray.get(mid));
        root.left = createBST(sarray, st, mid - 1);
        root.right = createBST(sarray, mid + 1, end);
        return root;
    }

    public static Node bst2balancebst(Node root) {
        ArrayList<Integer> sarray = new ArrayList<>();
        inorder(root, sarray);
        root = createBST(sarray, 0, sarray.size() - 1);
        return root;
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // leftsubtree
            root.left = insert(root.left, val);
        } else {
            // rightsubtree
            root.right = insert(root.right, val);

        }
        return root;

    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = bst2balancebst(root);
        inorder(root);

    }
}
