public class MirrorBST {
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
        public static Node mirrorbst(Node root){
            if(root==null) return null;
            Node lefts = mirrorbst(root.left);
            Node rights = mirrorbst(root.right);
            root.left=rights;
            root.right = lefts;
            return root;
        }

            
                
                
        public static void main(String[] args) {
            int values []={3,5,6,8,10,11};
            Node root = null;
            for(int i=0;i<values.length;i++){
                root= insert(root, values[i]);
            }
            inorder(root);
            System.out.println();
            mirrorbst(root);
            inorder(root);
        }
    
}
