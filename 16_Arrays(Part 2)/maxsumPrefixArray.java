public class maxsumPrefixArray {
    public static void maxsum(int nums[])
    {
        int n=nums.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int prefix[]= new int [n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {                                                        //!!WARNING
            prefix[i]=prefix[i-1]*nums[i];
        }
        for(int i=0;i<n;i++)
        {
            int st=i;
            for(int j=0;j<n;j++)
            {
                int end=j;
                cs=st==0? prefix[end]:prefix[end]-prefix[st-1]; //if st=0 then cs is end element of prefix
                if(cs>ms) ms=cs;
            }
        }
        System.out.println("Maximum sum is : "+ms);
    }
    public static void main(String[] args) {
        int nums[]= {1,-3,2};
        maxsum(nums);
    }
    
}
