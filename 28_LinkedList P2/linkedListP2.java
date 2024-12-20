import java.lang.classfile.components.ClassPrinter.Node;

public class linkedListP2 {
    public  static class Node{
        int data ;
        Node next;
        public Node (int data){
            this.data = data;
            this.next=null;
        }
        
    }
    public static boolean isCycle(){
        Node slow= head;
        Node fast= head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true; //it means that is linked list is forming cylcle
            }
        }
        return false ;// no cycle is formed
    }
    public static Node head;
    public static Node size;
    
    public static void main(String[] args) {
      
        head = new Node (1);
        head.next = new Node(2);
        head.next.next= new  Node(3);
        head.next.next.next =head; 
        System.out.println(isCycle());      

    }
    
}
