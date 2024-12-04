public class Q2 {
    public static Boolean isEven(int num)
    {
       if (num%2==0) return true;
      else return false;

       
    }
    
    public static void main(String[] args) {
        int num = 120;
        boolean ans= isEven(num);
        System.out.println(ans);
    }
    
}
