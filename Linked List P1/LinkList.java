public class LinkList {
    //basic intro to linkedlist and some function...
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node to the beginning of the list
    public void addFirst(int data) {
        size++; 
                Node newNode = new Node(data);
                if (head == null) {
                    head = tail = newNode;
                    return;
                }
                newNode.next = head; // Step 2: Linking new node to the current head
                head = newNode; 
                 // Step 3: Making new node the head
            }
        
            // Add node to the end of the list
            public void addLast(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = tail = newNode;
                    return;
                }
                tail.next = newNode; // Link the current tail to the new node
                tail = newNode;      // Update tail to the new node
                size++; 
            }
        
            // Print the linked list
            public void Print() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
            //Add in the middle 
            public   void addMid(int index,int data)
            {
                if(index==0){
                    addFirst(data);
                    return;
            }
            Node newNode = new Node (data);
            Node temp = head;
            int i=0;
            while(i<index-1)
            {
                temp= temp.next;
                i++;
            }
            //i = index-1 or temp ==> prev
            newNode.next= temp.next;
            temp.next= newNode;
            size++; 
        }
        public static void main(String[] args) {
           // LinkList  ll = new LinkList ();
            LinkList ll = new LinkList();

            ll.addFirst(1);
        ll.Print();
        ll.addFirst(2);
        ll.Print();
        ll.addLast(3);
        ll.Print();
        ll.addLast(4);
        ll.Print();
        ll.addMid(2,10);
        ll.Print();
        System.out.println(size);

    }
}
