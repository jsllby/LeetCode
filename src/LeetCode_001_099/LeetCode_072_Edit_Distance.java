package LeetCode_001_099;

public class LeetCode_072_Edit_Distance {
    public int minDistance(String word1, String word2) {

        int m = word1.length(), n = word2.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = n - i;
        for (int i = m - 1; i >= 0; i--) {
            int temp = m - i - 1;
            dp[n] = m - i;
            for (int j = n - 1; j >= 0; j--) {
                int next_temp = dp[j];
                if (word1.charAt(i) == word2.charAt(j)) dp[j] = temp;
                else
                    dp[j] = Math.min(temp, Math.min(dp[j + 1], dp[j])) + 1;
                temp = next_temp;
            }
        }
        return dp[0];


//        int[][] dp = new int[m + 1][n + 1];
//        for (int i = 0; i < n; i++) dp[m][i] = n - i;
//        for (int i = 0; i < m; i++) dp[i][n] = m - i;
//
//
//        for (int i = m - 1; i >= 0; i--) {
//            for (int j = n - 1; j >= 0; j--) {
//                if (word1.charAt(i) == word2.charAt(j)) dp[i][j] = dp[i + 1][j + 1];
//                else
//                    dp[i][j] = Math.min(dp[i + 1][j + 1], Math.min(dp[i][j + 1], dp[i + 1][j])) + 1;
//            }
//        }
//        return dp[0][0];
    }
}
