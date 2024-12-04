public class Q9 {
    public static int power(int x,int n)
    {
        if(n==0) return 1;
        int xnmn1= power(x,n-1);
        int xpn= x*xnmn1;
        return xpn;
        // return x* power(x,n-1);
        // TC= O(n) 
        //Sc= O(n)
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));

    }
}
