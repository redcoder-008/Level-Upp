class live {


    public static void printDecreasing(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }


    public static void printIncreasing(int n){
        if(n==0){
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }

    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int lastTerm = fib(n-1);

        int sLastTerm = fib(n-2);

        int nthTerm = lastTerm + sLastTerm;

        return nthTerm;
    }


    public static void main(String[] args){
        int n = 10;

        int ans = fib(n);
        System.out.println(ans);
    }
}