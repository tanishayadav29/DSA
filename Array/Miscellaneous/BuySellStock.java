package Miscellaneous;
//BEST TIME TO BUY SELL STOCK
// wap to find maximise profit to buy and sale stock

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_price=prices[0];
        for ( int i=0; i< prices.length;i++){
            if (prices[i]<min_price){
                min_price=prices[i];
            }
            else{
                max_profit=Math.max(max_profit,prices[i] - min_price);
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        BuySellStock obj = new BuySellStock();  // create object

        int ans = obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(ans);
    }
}