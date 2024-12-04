public class Q3 {
    public static void isPalindrome(int n)
    {
        int newNum=0;
        int num=n;
        System.out.println("Checking");
        while(num !=0)
        {
            int rem=num%10;
             newNum= (newNum*10)+rem;
             num=num/10;

        }
      

        if(n==newNum)
        {
            System.out.println(n +" is a Palindrome  number ");
        }
        else {System.out.println(n+" is not a palindrome number");}
        System.out.println("Completed....");
    }
    public static void main(String[] args) {

        int number= 101;
        isPalindrome(number);
    }
    
}
