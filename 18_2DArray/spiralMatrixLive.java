public class spiralMatrixLive {
    public static void main(String[] args) {
        int matrix[][]= { 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int top=0,left=0,bottom=matrix.length-1,right=matrix[0].length-1;
        while( top<=bottom && left<=right)
        {
           
            //left
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(matrix[left][i]+" ");
            }
            left++;
            //bottom
            for(int i=bottom;i<=right;i++)
            {
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            //right
            for(int i=bottom;i>=top;i--)
            {
                System.out.print(matrix[right][i]+" ");
            }
            right--;
            //top
            for(int i=right;i>=left;i--)
            {
                System.out.print(matrix[top][i]+" ");
            }
            top++;
        }
    }
    
}
