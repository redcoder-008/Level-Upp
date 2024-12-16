public class demo {
    public static boolean isPalindrome(int x) {
        int n=x;
            int newnum=0;
            while(n >0){
                int rem = n%10;
                newnum  = newnum*10 + rem;
                n/=10; 
            }
            System.out.println(newnum);
            if(x == newnum) return true;
            if(x == newnum) return true;
            else return false;

            
        }
        public static void main(String[] args) {
            System.out.println(isPalindrome(121));
        
    }
}
