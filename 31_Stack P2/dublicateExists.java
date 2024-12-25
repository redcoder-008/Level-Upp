import java.util.Stack;

public class dublicateExists {
    public static boolean hasDublicate(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch ==')' ){
                int count=0;
                while(s.peek() != '(' ){
                 count++;
                 s.pop();
                }
              if(count<1){
                return true;//dublicates exists
              }
            }
            else{
                s.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasDublicate("((a+b))"));
    }
}
