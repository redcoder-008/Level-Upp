public class hollowRhombus {
    public static void main(String[] args) {
       
        int totCol=5,totRows=5;
        
        for(int row=1;row<=totRows;row++)
        {
            //spaces
            for(int s=1;s<=totRows-row;s++)
            {
                System.out.print(" ");
            }
            //hollow
            for(int col=1;col<=totCol;col++)
            {
                if(row==1||row==totRows || col==1 || col==totCol)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }

            }
          System.out.println();
        }
    }
    
}
