public class floydsTriangle {
    public static void main(String[] args) {
        int num= 1;
        int n=5;
        for(int row=1;row<=n;row++)
        {
            for(int col= 1;col<=n;col++)
            {
                if(row-col >=0)
                { 

                    System.out.print(num+" ");
                    num++;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
