public class liveclass {
    public static void main(String[] args) {
        // int x = 11;
        // // we have to set 6th bit of x
        // x = (x | (1 << 6));
 
        // // this should print 75
        // System.out.println(x);
 
        // int x = 9;
        // // we have to clear the 3rd bit
 
        // x = x & (~(1 << 3));
        // System.out.println(x);
 
        int a = 12;
        int b = 53;
 
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
 
        // swap these numbers
        // after swapping a = 53, b = 12;
 
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
 
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
 
    }
}