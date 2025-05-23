public class SizeOFLargestBSTInBT {
    static class Info {
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int val) {
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static int maxBST = 0;

    public static Info largestBSt(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBSt(root.left);
        Info rightInfo = largestBSt(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBst && rightInfo.isBst) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);

        }
        return new Info(false, size, min, max);

    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        inorder(root);
        System.out.println();
      Info info = largestBSt(root);
        System.out.println("The size of the largest BST in BT is " + maxBST);
        System.out.println(maxBST);


    }

}
