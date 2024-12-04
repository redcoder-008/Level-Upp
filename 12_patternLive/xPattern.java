public class xPattern {
    public static void main(String[] args) {
        int n=11;

        for(int row=1;row<=n;row++)
        {
            for( int col=1;col<=n;col++)
            {
                if(row+col ==n+1  ||row-col==0 )
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
