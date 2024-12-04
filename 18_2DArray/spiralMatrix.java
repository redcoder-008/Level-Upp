public class spiralMatrix {
    public static void printSpiral(int matrix[][])
    {
        int strow=0;
        int stcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;  
        while(strow<=endrow && stcol<=endcol)
        {
            //top
            for(int i=stcol;i<=endcol;i++)
            {
                System.out.print(matrix[strow][i]+" ");
            }
            //right
            for(int i=strow+1;i<=endrow;i++)
            {
                System.out.print(matrix[endcol][i]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=stcol;j--)
            {
                if(strow==endrow) break;
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=stcol+1;i--)
            {
                if(stcol==endcol) break;
                System.out.print(matrix[stcol][i]+" ");
            }
            strow++;
        stcol++;
    endrow--;
endcol--;        }
        
        
    }
    public static void main(String[] args) {
        int matrix[][]= { 
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                        };
                        printSpiral(matrix);
    }
}
