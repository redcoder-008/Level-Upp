public class fastExponential {
    public static void fastExpo(int a,int n)
    {
        int ans=1;                         ///used to calculate power.....
        while(n>0)
        {
            if((n&1)!=0) //check lsb
            {
                ans*=a;

            }
            a*=a;
            n=n>>1;
            // n>>=1;

        }
        System.out.println("answer= " +ans);
    }
    public static void main(String[] args) {
        fastExpo(3, 2);
    }
    
}
