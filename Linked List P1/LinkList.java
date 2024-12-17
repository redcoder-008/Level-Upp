public class LinkList {
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

    // Add node to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // Step 2: Linking new node to the current head
        head = newNode;      // Step 3: Making new node the head
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
    }

    // Print the linked list
    public static void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkList  ll = new LinkList ();
        ll.addFirst(1);
        Print();
        ll.addFirst(2);
        Print();
        ll.addLast(3);
        Print();
        ll.addLast(4);
        Print();
    }
}
