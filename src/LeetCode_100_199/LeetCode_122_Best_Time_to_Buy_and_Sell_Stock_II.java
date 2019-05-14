package LeetCode_100_199;

public class LeetCode_122_Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
//        int min_buy = Integer.MAX_VALUE, sum_profit = 0;
//        for (int i : prices) {
//            if (i - min_buy > 0) {
//                sum_profit += i - min_buy;
//                min_buy = i;
//            } else {
//                min_buy = min_buy < i ? min_buy : i;
//            }
//        }
//        return sum_profit;

//        int valley = prices[0], peak = prices[0];
//        int sum = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            if (prices[i] > prices[i + 1]) {
//                peak = prices[i];
//                valley = prices[i + 1];
//                sum += peak - valley;
//            } else if (prices[i] < valley) valley = prices[i];
//        }
//        sum += prices[prices.length - 1] - valley;
//        return sum;

//        int sum = 0;
//        for(int i =1;i<prices.length;i++){
//            if(prices[i]>prices[i-1]){
//                sum+=prices[i]- prices[i-1];
//            }
//        }
//        return sum;

        int sum = 0, i = 1;
        while (i < prices.length) {
            while (i < prices.length && prices[i] <= prices[i - 1]) i++;
            int min = prices[i - 1];
            while (i < prices.length && prices[i] >= prices[i - 1]) i++;
            int max = prices[i-1];
            sum += max - min;
        }
        return sum;
    }
}
