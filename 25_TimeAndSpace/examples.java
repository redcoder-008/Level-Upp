public class examples{
    public static void main(String[] args) {
         /* //simple loop
        for(int i=0;i<n;i++)
        {
            //some constant work is done here
        }
            TC: O(n)
            */  int n=5;
            //break
            for(int i=0;i<n;i++) //Tc: O(N^2)
            {
                 for(int j= i+1;j<n;j++)
                 {
                    //some constant work is done ....
                 }
            }
            //break
            for(int l=0;l<n;l++) //Tc :   O(n^2)
            {
                for(int k=0;k<l;k++){

                }
            }


    }
}