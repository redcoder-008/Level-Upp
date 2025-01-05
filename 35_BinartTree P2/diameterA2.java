//import javax.swing.tree.TreeNode;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }
}
public class diameterA2{
  
    
    public static int height(Node root){
        if(root==null) return 0;
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;
    }
        public static int diameterOfBinaryTree(Node root) {
        
         
                if(root==null) return 0;
                int lh= height(root.left);
                int ld= diameterOfBinaryTree(root.left);
                int rh= height(root.right);
                int rd= diameterOfBinaryTree(root.right);
                int sd= lh+rh+1;
                return  Math.max(Math.max(ld,rd) , sd);
               
            }
            public static void main(String[] args) {
                Node root= new Node(1);
                root.left=new Node(2);
                root.right=new Node(3);
                root.left.left= new Node(4);
                root.left.right= new Node(5);
               
               root.right.left= new Node(6);
                root.right.right= new Node(6);
               int ans= diameterOfBinaryTree(root);
       System.out.println(ans);
        
        
    }

}

