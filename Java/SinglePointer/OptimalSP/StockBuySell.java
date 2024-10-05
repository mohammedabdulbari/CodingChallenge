class StockBuySell
{
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
                buy=prices[i];
            else if(prices[i]-buy>profit)
                profit=prices[i]-buy;
        }
        return profit;
    }
 
public static void main(String[] args)
{
    int prices[]={5,2,3,8,1,9};
    System.out.println(maxProfit(prices));
}
}
