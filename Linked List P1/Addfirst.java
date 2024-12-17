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
}
