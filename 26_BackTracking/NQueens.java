public class NQueens {
    public static void PlaceQueen(String board[][], int row, int n)
    {
        if(row==n)
        {
            printBoard(board, n);
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,row,j,n)) //
            {
                board[row][j] = "Q";
                PlaceQueen(board,row+1,n);
                board[row][j]= "X";
            }
        }
    }
    public static boolean isSafe(String board[][],int row,int col,int n){
        //horizotally
        for(int i=0;i<n;i++)
        {
            if(board[row] [i] =="Q") return false;
        }
        //vertically up 
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == "Q" ) return false;
        }
        //left diagonally up 
        for(int i= row-1,j=col-1 ;i>=0 && j>=0;i--,j-- )
        {
            if(board[i][j] == "Q") return false;
        }
        //right diagonally up
        for(int i=row-1,j=col+1;i>=0 && j<n; i--,j++)
        {
            if(board[i][j] == "Q") return false;
        }
        return true;
    }
    
    public static void printBoard( String  board [] [],int n)
    {
        System.out.println("------Chess Board-------");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n=4;
        String board[][]= new String[n][n] ;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]= "x";
            }
        }
        //N Queens problem
        PlaceQueen(board, 0, n);
       
    }
}
