public class Q3 {
    //count sets bits in a number
    public static void countBits (int n)
    {
        int count =0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count ++;

            }
            n=n>>1;
        }
        System.out.println("Total bits = "+count );
    }
    public static void main(String[] args) {
        countBits(10);
    }
    
}
