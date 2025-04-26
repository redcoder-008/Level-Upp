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
        

    }
}
