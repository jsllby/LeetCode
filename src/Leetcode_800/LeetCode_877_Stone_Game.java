package Leetcode_800;

public class LeetCode_877_Stone_Game {
    public boolean stoneGame(int[] piles) {
//        int[][] dp = new int[piles.length][piles.length];
//        for (int i = piles.length - 1; i >= 0; i--) {
//            for (int j = i; j < piles.length; j++) {
//                if (i == j) {
//                    dp[i][j] = piles[i];
//                } else dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
//            }
//        }
//        return dp[0][piles.length-1]>0;

        int[]dp = new int[piles.length];
        for (int i = piles.length - 1; i >= 0; i--) {
            for (int j = i; j < piles.length; j++) {
                if (i == j) {
                    dp[j] = piles[i];
                } else dp[j] = Math.max(piles[i] - dp[j], piles[j] - dp[j - 1]);
            }
        }
        return dp[piles.length-1]>0;
    }
}
