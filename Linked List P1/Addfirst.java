import java.util.LinkedList;

public class Addfirst{
    public static class Node{
        int data;
        Node next;
        public Node(int data )
        {
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data)
    {
        //step1 create new node
        Node newNode = new  Node( data);
        if(head == null)
        {
            head = tail = newNode ;
            return;
        }
        //Step 2 new node next ==>> head
        newNode.next = head; //linking
        //step 3  head = new Node
        head = newNode;
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ///add last
        ll.addLast(3);
        ll.addLast(4);

    }
}
