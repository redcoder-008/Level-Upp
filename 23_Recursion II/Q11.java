public class Q11
{
    //tiling problem approach
    public static int tilingproblem(int n)
    {
        if(n==1 || n==0) return 1;
        int fnm1 = tilingproblem(n-1);
        int fnm2= tilingproblem(n-2);
        int noofWays= fnm1+fnm2;
        return noofWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }
}
