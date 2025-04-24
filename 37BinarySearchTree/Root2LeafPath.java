import java.util.*;
public class Root2LeafPath {
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
        public static void root2leafPath(Node root,ArrayList<Integer> path){
            if(root==null) return;
            path.add(root.data);
            if(root.left == null && root.right == null){ 

                printpath(path);
            }
                root2leafPath(root.left, path);
                root2leafPath(root.right, path);
                path.remove(path.size()-1);

        }

        public static void printpath(ArrayList<Integer>path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+ "-->");
            }
            System.out.println("Null");
        }
            
                
                
        public static void main(String[] args) {
            int values []={8,5,3,6,10,11,14};
            Node root = null;
            for(int i=0;i<values.length;i++){
                root= insert(root, values[i]);
            }
           // inorder(root);
            root2leafPath( root, new ArrayList<>());
        }
    
}
