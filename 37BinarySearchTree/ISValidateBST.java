public class ISValidateBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data=val;
        }
        }
        public static Node insert(Node root,int val){
            if(root==null){
                root=new Node(val);
                return root;
            }
            if(root.data > val){
                //leftsubtree
                root.left= insert(root.left, val);
            }else{
                //rightsubtree
                root.right= insert(root.right,val);

            }
            return root;
            
        }
        public static void inorder(Node root){
            if (root==null)  return;
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }
        public static boolean isValid(Node root, Node min,Node max){
            if(root==null ) return true;
            if(min!=null && root.data <= min.data){
               return false; 
            }
            if(max!= null && root.data >= max.data ) return false;
            return isValid(root.left, min, root) 
            &&     isValid(root.right, root, max);
        }

            
                
                
        public static void main(String[] args) {
            int values []={8,5,3,6,10,11,14};
            Node root = null;
            for(int i=0;i<values.length;i++){
                root= insert(root, values[i]);
            }
            inorder(root);
           if( isValid(root, null, null)) {
            System.out.println("Given tree is valid BST");
           }
           else {
            System.out.println("Given tree is not bst");
           }
        }


    
}
