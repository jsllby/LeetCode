package LeetCode_100_199;

public class LeetCode_123_Best_Time_to_Buy_and_Sell_Stock_III {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;

        int buy_1 = prices[0];
        int buy_2 = buy_1;

        int profit_1 = 0;
        int profit_2 = 0;

        for (int i = 1; i < prices.length; i++) {
            profit_1 = Math.max(profit_1, prices[i] - buy_1);
            buy_1 = Math.min(buy_1, prices[i]);

            profit_2 = Math.max(profit_2, prices[i] - buy_2);
            buy_2 = Math.min(buy_2, prices[i] - profit_1);
        }

        return profit_2;


//        int K = 3;
//        int[] dp = new int[K+1];
//        int[] min = new int[K + 1];
//        Arrays.fill(min, prices[0]);
//        for (int i = 1; i < prices.length; i++) {
//            for (int k = 1; k <= K; k++) {
//                min[k] = Math.min(min[k], prices[i] - dp[k-1]);
//                dp[k] = Math.max(dp[k], prices[i] - min[k]);

//            }
//        }
//        return dp[K];
    }
}
