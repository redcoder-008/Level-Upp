class Node{
    Node root;
    Node right,left;
    int data;
     Node(int data ){
        this.data=data;
        this.right=null;
        this.left=null;

    }
} 
public class KthLevel{
  

public static void kthlevell(Node root,int level,int k){
    if(root==null) return;
    if(level == k){
        System.out.print(root.data+" ");return;
    }
    kthlevell(root.left, level +1, k ); 
    kthlevell(root.right, level +1, k );

    
}
    
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
       
       root.right.left= new Node(6);
        root.right.right= new Node(7);
        kthlevell(root, 1, 3);
        
    }
}