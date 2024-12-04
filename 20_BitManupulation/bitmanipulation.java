public class bitmanipulation {
    public static void getIthBit(int n,int i)
    {
        int bitMask= 1<< i;
        if((n&bitMask)==0)
        {
           System.out.println("ith bit is 0");
        }
        else    System.out.println("ith bit is 1");

        
    }
    public static void setIthbit(int n,int i)
    {
        int bitmask=1<<i;
        System.out.println(n|bitmask);
    }
    public static void clearIthBit(int n,int i)
    {
        int bitmask= ~(1<<i);
        System.out.println(n&bitmask);
    }
    public static void clearLastIthBit(int n,int i)
    {
        int bitmask=(~0)<<i;
        System.out.println(n & bitmask);
        //or 
         
    }
    public static void clearRangeOfBits(int n,int i,int j)
    {
        int a= ((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n&bitmask);
    }
    

    public static void main(String[] args) {
        // clearIthBit(15, 2);
        // clearLastIthBit(15, 2);
        clearRangeOfBits(31,1,3);
        
    }
}
