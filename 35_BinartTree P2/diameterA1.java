
 class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }
}
public class diameterA1{
  
    
    public static int height(Node root){
        if(root==null) return 0;
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root){

        if(root==null) return 0;
        int lh= height(root.left);
        int ld= diameter(root.left);
        int rh= height(root.right);
        int rd= diameter(root.right);
        int selfDiameter = lh+rh+1;
        return Math.max(selfDiameter,Math.max(ld,rd));
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
       
       root.right.left= new Node(6);
        root.right.right= new Node(6);
        Node subTree = new Node(2);
        subTree.right= new Node(4);
        subTree.left= new Node(5);
       int ans= diameter(root);
       System.out.println(ans);
       System.out.println();
        
        
    }

}