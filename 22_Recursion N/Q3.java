public class Q3 {
    public static void printn(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
            
        }
        System.out.print(n+" ");
        printn(n-1);
        // if(true)
        // {
            System.out.print(n+" "); 
            return;
        // }
        // printn(n);

    }
    public static void main(String[] args) {
        printn(10);
    }
    
}
