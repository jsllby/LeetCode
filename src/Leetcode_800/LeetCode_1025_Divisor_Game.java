package Leetcode_800;

import java.util.Arrays;

public class LeetCode_1025_Divisor_Game {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N + 1];
        Arrays.fill(dp, false);
        for (int n = 2; n <= N; n++) {
            for (int x = 1; x*x < n; x++) {
                if (n % x == 0 && !dp[n - x]) {
                    dp[n] = true;
                    break;

                }
            }
        }
        return dp[N];
    }
}
