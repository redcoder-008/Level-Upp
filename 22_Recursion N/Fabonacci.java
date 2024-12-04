public class Fabonacci {
    public static int fabonacci(int n)
    {
        if(n==1 || n==0){ 
            // System.out.print(n+" "); 
            return n ;
        }
        int fnm1= fabonacci(n-1);
        int fnm2= fabonacci(n-2);
        int fab = fnm1+fnm2;
        // System.out.print(fab+" ");
        return fab;
    }
    public static void main(String[] args) {
       System.out.println( fabonacci(12));
    }
    
}
