
import java.util.Stack;
//import java.util.Queue;
class NewQueue{
    
    
     Stack<Integer> s1= new Stack<>();
     Stack<Integer> s2= new Stack<>();
    
    NewQueue(){
       s1= new Stack<>();
       s2= new Stack<>();
   }
    public  boolean isEmpty(){
        return s1.isEmpty();
    }
    //adding the element in stack O (n)
    public  void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
    //remove
    public  int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1  ;
        }
        return s1.pop();
    }
    //peek
    public  int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
}
public class QueueUsing2Stack {

   
    public static void main(String[] args) {
        NewQueue q = new NewQueue();
        q.add(1);
        q.add(2);
        q.add(3);

        q.add(4);
        // Remove and print elements
        System.out.println("Removed: " + q.remove()); // Output: 1
        System.out.println("Peek: " + q.peek());      // Output: 2
        System.out.println("Removed: " + q.remove()); // Output: 2
        System.out.println("Peek: " + q.peek());      // Output: 3
        System.out.println("Queue is empty: " + q.isEmpty()); // Output: false

        // Remove remaining elements
        q.remove();
        q.remove();

        // Check if queue is empty
        System.out.println("Queue is empty: " + q.isEmpty()); // Output: true

        // Try to peek and remove from an empty queue
        System.out.println("Peek on empty queue: " + q.peek());  // Output: Queue is empty, -1
        System.out.println("Remove from empty queue: " + q.remove()); // Output: Queue is empty, -
       
    }
    
}
