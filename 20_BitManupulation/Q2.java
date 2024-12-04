public class Q2 {
    //check the number if it is the power of two or not
    public static void checknum(int n)
    {
        if((n&(n-1))==0)
        {
           System.out.println("true");
        }
        else System.out.println("False");

    }
    public static void main(String[] args) {
        checknum(8);
    }
    
}
