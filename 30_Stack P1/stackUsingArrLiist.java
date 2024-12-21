import java.util.ArrayList;
import java.util.Stack;
public class stackUsingArrLiist{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return (list.size()==0);
        }
        //push data
        public static void push(int data){
            list.add(data);
            return;
        }
        //pop data
        public static int pop(){
            int top= list.get(list.size()-1);
            list.remove ( list.size()-1);
            return top;
        }
        //peek data 
        public static int peek(){
            int top= list.get(list.size()-1);
            return top;
        }


    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new  Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while( !s.isEmpty() ){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}