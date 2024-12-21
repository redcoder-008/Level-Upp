import java.util.ArrayList;
public class part1{
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return (list.size()==0);
        }
        //push data
        public static void push(int data){
            list.add(data);
            return;
        }


    }
}