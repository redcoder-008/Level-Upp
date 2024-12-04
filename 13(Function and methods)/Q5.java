public class Q5 {
    public static int sumOfDigits(int num)
    {
        int sum=0;
        int n =num;
        while(n>0)
        {
            int rem= n%10;
            sum+=rem;
            n/=10;

        }
        return sum;


    }
    public static void main(String[] args) {
        int ans= sumOfDigits(123);
        System.out.println(ans);
    }
    
}
