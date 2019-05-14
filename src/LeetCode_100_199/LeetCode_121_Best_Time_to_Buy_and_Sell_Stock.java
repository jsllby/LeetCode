package LeetCode_100_199;

class LeetCode_121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for (int i : prices) {
            max = Math.max(max,i-buy);
            buy = Math.min(buy,i);
        }
        return max;
    }
}
