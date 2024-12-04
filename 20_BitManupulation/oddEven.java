public class oddEven {
    public static void checkNum(int n)
    {
        int bitMask=1;
        if((n & bitMask)==0)
        {
            System.out.println("the number is even");
        } 
        else System.out.println("THe number is odd");
    }
    public static void main(String[] args) {
        int n=13;
        checkNum(n);;
        checkNum(120);
    }
    
}
