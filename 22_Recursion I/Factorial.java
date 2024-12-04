public class Factorial {
    public static int factorial (int n)
    {
        if(n==1 ) return 1;
      int   fnm1= factorial(n-1);
        int fact = n*fnm1;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
}
