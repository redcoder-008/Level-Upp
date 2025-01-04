import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    //preorder
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
    //inorder
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
//post order

public static void postOrder(Node root){
    if(root == null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");
} 
//level order 4 tree
public static void levelOrder(Node root){
    if(root==null) return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){

                break;
            } else{
                q.add(null);
            }

        }else{ 
        System.out.print(currNode.data+" ");
        if(currNode.left != null) {
            q.add(currNode.left);
        }
        if(currNode.right != null){
            q.add(currNode.right);
        }
    }

    }

}
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.BuildTree(nodes);
       // System.out.println(root.data);
       levelOrder(root);
       System.out.println("Making of tree,tree traversal like post order,pre order, in order,level order");
    }
}