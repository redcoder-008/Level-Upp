import java.util.Stack;

public class Add_At_The_Bottom {
    // Method to add an element at the bottom of the stack
    public static void add_At_Bottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        add_At_Bottom(s, data);
        s.push(top);
    }

    // Method to print the stack without altering its content
    public static void printstk(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        System.out.println(top);
        printstk(s);
        s.push(top); // Push back the element to restore the stack
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original stack:");
        printstk(s);

        add_At_Bottom(s, 4);

        System.out.println("\nStack after adding 4 at the bottom:");
        printstk(s);
    }
}
