
public class BuildTreePreOrder{
  static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right= null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node BuildTree(int nodes[] ){
            idx++;
            if(nodes[idx] == -1){ return null;}
            Node newNode = new Node(nodes[idx]);
            newNode.left= BuildTree(nodes);
            newNode.right= BuildTree(nodes);
            return newNode;

        }

    }
    //tree Traversal
    public static void preOrder(Node root){
        {
            if(root == null){
                System.out.print("-1 ");return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.BuildTree(nodes);
       // System.out.println(root.data);
       preOrder(root);
    }
}