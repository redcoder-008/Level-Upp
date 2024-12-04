public class maxsumKadane {
    public static void main(String[] args) {
        int nums[]={1,-3,2};
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            if(cs<0) cs=0;
            ms= Math.max(cs,ms);

        }
        System.out.println("The maxsum is "+ms);
    }
    
}
