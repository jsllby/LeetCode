package LeetCode_001_099;

public class LeetCode_062_Unique_Paths {
    public int uniquePaths(int m, int n) {
        if (m > n) {  // n is the smaller one
            m = m+n;
            n = m-n;
            m = m -n;
        }
        int sum = m + n - 2;
        long res= 1;
        for(int i =1;i<=m-1;i++)    res = res*(sum--)/i;
        return (int)res;

//        int[] dp = new int[n];
//        for (int x = m - 1; x >= 0; x--) {
//            for (int y = n - 1; y >= 0; y--) {
//                if (x == m - 1 | y == n - 1) dp[y] = 1;
//                else dp[y] = dp[y] + dp[y + 1];
//            }
//        }
//        return dp[0];
    }
}
