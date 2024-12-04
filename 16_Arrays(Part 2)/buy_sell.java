public class buy_sell {
    public static int buyAndSell(int prices[])
    {
        int maxprofit=0;
        int bp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(bp<prices[i])
            {
             int   profit=prices[i]-bp;
             maxprofit=Math.max(maxprofit,profit);

            }
            
            else bp=prices[i];
        }
        return maxprofit;

    }
    
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSell(prices));
    }
}
