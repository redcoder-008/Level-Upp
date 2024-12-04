public class maxsumBruteforce
{
    public static void maxSum(int nums[])
    {
        int n= nums.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {    int st=i;
            for(int j=i;j<n;j++)
            {
                int end=j; 
                cs=0;
                for(int k=st;k<=end;k++)
                {
                    cs+=nums[k];
                }
                if(ms<cs)
                {
                    ms=cs;
                }

            }
        }
        System.out.println("Maxsum is : "+ms);
    }
    public static void main(String[] args) {
        int nums[]={1,-3,2};
        maxSum(nums);
    }
}