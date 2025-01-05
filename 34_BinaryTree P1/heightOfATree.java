class Node{
    int data;
    Node left,right;
    Node(int data ){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class heightOfATree {
    public static int findHeight(Node root){
        if(root==null) return 0;
        int lh= findHeight(root.left);
        int rh=findHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int countNode(Node root){
        if(root==null)  return 0;
        int LN = countNode(root.left);
        int RN= countNode(root.right);
        return LN+RN+1;

    }
    public static int NodeSum(Node root){
        if(root == null) return 0;
        int leftSum= NodeSum(root.left);
        int rightSum= NodeSum(root.right);
        return leftSum+rightSum+ root.data;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
       
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        System.out.println(NodeSum(root));

    }
    
}
