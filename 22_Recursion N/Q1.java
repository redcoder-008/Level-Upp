public class Q1{
    public static void printNum(int n)
    {
        if(n==1){  System.out.print(n+" "); return;}
        System.out.print(n+" ");
        printNum(n-1);
        


    }
    public static void main(String[] args) {
        int n=123;
        printNum(n);
    }
}