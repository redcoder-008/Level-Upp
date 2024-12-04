public class Subarrays {
    public static void subarr(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            int st=i;
            for(int j=i;j<nums.length;j++)
            {
                int end=j;
                for(int k=st;k<=end;k++)
                {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        subarr(numbers);
    }
    
}
