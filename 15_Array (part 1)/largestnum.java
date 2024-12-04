public class largestnum {

    public static int largestNum(int numbers[] )
    {
        int greatestNum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] > greatestNum)
            {
                greatestNum = numbers[i];
            }
        }
        return greatestNum;

    }
    public static void main(String[] args)  {
        int numbers[]= {11,2,3,4,5,6,7,8,9,10};
        int ans= largestNum(numbers);
        System.out.println(ans);
    }
    
}
