package LeetCode_001_099;

public class LeetCode_063_Unique_Paths_II {
    int[][] obstacle;
    int endX, endY;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null) return 0;

        // try DFS: It's time limit exceeded
        endX = obstacleGrid.length - 1;
        endY = obstacleGrid[0].length - 1;
        obstacle = obstacleGrid;
        return dfs(0, 0);


        // DP
//        int m = obstacleGrid.length, n = obstacleGrid[0].length;
//        int[] dp = new int[n + 1];
//        dp[n - 1] = obstacleGrid[m - 1][n - 1] ^ 1;
//        for (int x = m - 1; x >= 0; x--) {
//            for (int y = n - 1; y >= 0; y--) {
//                if (obstacleGrid[x][y] == 1) dp[y] = 0;
//                else dp[y] += dp[y + 1];
//            }
//        }
//        return dp[0];
    }

    int dfs(int x, int y) {
        if (x > endX || y > endY || obstacle[x][y] == 1) return 0;
        if (x == endX && y == endY) return 1;
        return dfs(x, y + 1) + dfs(x + 1, y);
    }
}
