public class Second {
    public static void main(String []args)
    {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
