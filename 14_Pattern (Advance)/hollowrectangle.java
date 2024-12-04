public class hollowrectangle
{
    public static void hollowrectanglee(int totRows, int totCol)
    {
        for(int row=1;row<=4;row++)
        {
            for(int col=1;col<=5;col++)
            {
                if(row==1|| row==4 || col==1 || col== 5)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        hollowrectanglee(5, 5);
     
    }
}
