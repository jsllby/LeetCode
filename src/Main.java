

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
//        String s1 = "adceb";
//        String s2 = "*a*b";
//        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};


        Solution temp = new Solution();
        temp.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});
        return;
    }
}


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // try DFS

        // DP
        if (obstacleGrid == null) return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n + 1];
        dp[n - 1] = obstacleGrid[m - 1][n - 1] ^ 1;
        for (int x = m - 1; x >= 0; x--) {
            for (int y = n - 1; y >= 0; y--) {
                if (obstacleGrid[x][y] == 1) dp[y] = 0;
                else dp[y] += dp[y + 1];
            }
        }
        return dp[0];
    }


}



