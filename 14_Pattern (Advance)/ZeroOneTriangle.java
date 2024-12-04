public class ZeroOneTriangle{
    public static void pattern(int n)
    {
       for(int i=1;i<=n;i++)
       { 
       {
        for( int j=1;j<=i;j++)
            if((i+j)%2==0)
            {
                System.out.print(1);
            }
            else System.out.print(0);
            
        }
        System.out.println();
        // num=0;

       } 
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
