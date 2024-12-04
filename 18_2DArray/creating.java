import java.util.Scanner;

public class creating{
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0; j<3; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.print("key found at cell"+"( "+i+","+j+")");
                    return true;
                }
                  }
            
        }
        System.out.println("KEy not founnd");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int [3][3];
        int n=matrix.length;
        int m= matrix[0].length;
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]= sc.nextInt();

            }
        }
        //printing
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);


    }

}