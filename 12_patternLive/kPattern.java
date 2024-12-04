public class kPattern {
    public static void main(String[] args) {
        int n=9;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(col== 1 || row+col==n || row-col==1 ){
                    System.out.print("*");

                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
