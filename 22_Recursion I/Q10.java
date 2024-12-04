public class Q10 {
    //calculate power of x in optimised solution
    public static int pow(int a,int n)
    {   if(n==0) return 1;
        int halfpower= pow(a, n/2);
        int halfsqr= halfpower*halfpower;
        if(n%2!=0) 
        {
            halfsqr *=a;
        }
        return halfsqr;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
