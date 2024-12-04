
public class BinomialFactor
{
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int binomialCofficient(int n,int r)
    {
        int rFactorial = factorial(r);
        System.out.println("Rfact : "+rFactorial);
        int nFactorial = factorial(n);
        System.out.println("nfact : "+nFactorial);
        int nmrFactorial = factorial(n-r);
        System.out.println("Rmnfact : "+nmrFactorial);
        // int denominator = rFactorial * rmnFactorial;
        // int binomial = nFactorial / denominator;
        int binomial=nFactorial  /(rFactorial*nmrFactorial);
      
        // int binomial = nFactorial/(rFactorial*rmnFactorial);
        return binomial;

    }
    public static void main(String[] args) {
       int ans = binomialCofficient(5, 2);
    
        System.out.println("Binomial factorial : "+ ans);
       


        
    }
}