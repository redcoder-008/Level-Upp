public class Q2 {
    public  static void printNum(int n)
    {
        if(n==1){  System.out.print(n+" "); return;}
        printNum(n-1); 
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        printNum(4);
    }
    
}
