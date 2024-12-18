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
        //remove first element
        public int remove( )
        {
            if(size==0)
            {
                System.out.println("Linked List is empty ");
                return Integer.MIN_VALUE;
            }
           else  if(size == 1)
            {
                int val=head.data;
                head = tail = null;
                size--;
                return val;

            }
            int val= head.data;
            head=head.next;
            size--;
            return val;
        }
        //REMOVE THE LAST ELEMENT OF THE NODE
        public int removelast()
        {
            if(size==0)
            {
                System.out.println("Linked list empty");
                return Integer.MIN_VALUE;
            }
            else if (size == 1 )
            {
                int value = head.data;
                head= tail = null;
                size=0;
                return value;
            }
            Node prev = head;
            for(int i=0;i<size-2;i++){
                prev = prev.next;
            }
            int value = prev.next.data; //taildata
            prev.next= null;
            tail=prev ;
            size --;
            return value; 
        }
        //iterative search in the link list
        public int itrsearch( int key){
            Node temp=head;
            int idx=1;
            while(temp != null)
            {
                if(temp.data == key) return idx;
                idx++;
               temp= temp.next;

            }
            return -1;

        }
        //recursive search
        public int helper(Node head,int key)
        {
            if(head == null) return -1;
            if(head.data == key) return 0;
            int idx= helper(head.next,key);
            if(idx == -1 ) return -1;
            return idx+1;
        }
        public int recsearch(int key)
        {
            return helper(head,key);
        }
        public static void main(String[] args) {
           // LinkList  ll = new LinkList ();
            LinkList ll = new LinkList();

            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
         //   ll.addLast(5);
            ll.addMid(3,4);
      
   

        
        ll.Print();
       // System.out.println(size);
      //  ll.remove();
      //  ll.Print();
      // ll.removelast();
      //  ll.Print();
        System.out.println("Found at idx : " +ll.recsearch(3));
        System.out.println("Found at idx : " +ll.recsearch(12));

    }
}