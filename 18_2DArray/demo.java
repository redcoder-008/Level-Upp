import java.util.ArrayList;
import java.util.List;

public class demo {
    public static List<Integer> asc(int mat[][])
    {
       
    
        int m=mat.length;
        int n=mat[0].length;
        int stcol=0;
        int strow=0;
        int endcol=n-1;
        int endrow=m-1; 
       List<Integer> result = new ArrayList<>();
        while(stcol<=endcol && strow<=endrow)
        {
            //top
            for(int i=strow;i<=endcol;i++){
                result.add(mat[strow][i]);
            }
            //right
            for(int i=endcol+1;i<=endrow;i++)
            {
                result.add(mat[endcol][i]);
            }
            //bottom
            for(int i=endcol-1;i>=endrow;i++)
            {   if(strow==endrow) break;
                result.add(mat[endrow][i]);
            }
            //left
            for(int i=endrow-1;i>=strow+1;i++)
            {  if(stcol==endcol)
                result.add(mat[stcol][i]);
            }
            stcol++;
            endcol--;
            strow++;
            endrow--;
        }
        return result;
    }
 
    }
    public static void main(String[] args) {
        int matrix[][]= { 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        asc(matrix); 
        
    }
    
}
