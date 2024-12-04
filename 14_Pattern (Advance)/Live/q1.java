public class q1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            //space
            for(int s=1;s<=n-i;s++) System.out.print(" ");
            //number
            int number=1;
            // boolean increasing =true;
            // while(number>0)
            // {
            //     System.out.print(number);
            //     if(number==i) 
            //     {
            //         increasing=false;
            //     }
            //     if(increasing == false)
            //     {
            //         number--;
            //     }
            //     else number++;
                
            // }
            
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print(number);
                if(j<i)
                {
                    number++;

                }
                else number --;
            }
       
System.out.println();
        }
    }
}