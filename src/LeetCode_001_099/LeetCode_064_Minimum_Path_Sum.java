package LeetCode_001_099;

public class LeetCode_064_Minimum_Path_Sum {
    int[][] dp, grid;
    int X, Y, min;

    public int minPathSum(int[][] grid) {

        //dfs
        if (grid == null || grid.length == 0) return 0;
        this.grid = grid;
        X = grid.length;
        Y = grid[0].length;
        dp = new int[X][Y];

        return dfs(0, 0);

        //DP
//        if (grid == null || grid.length == 0) return 0;
//        int m = grid.length, n = grid[0].length;
//        int[] dp = new int[n + 1];
//        for (int x = m - 1; x >= 0; x--) {
//            for (int y = n - 1; y >= 0; y--) {
//                if (x == m - 1 || (y != n - 1 && dp[y + 1] <= dp[y])) dp[y] = dp[y + 1] + grid[x][y];
//                else dp[y] += grid[x][y];
//            }
//        }
//        return dp[0];
    }

    int dfs(int x, int y) {
        if (dp[x][y] != 0) return dp[x][y];
        if (x == X - 1 && y == Y - 1) {
            dp[x][y] = grid[x][y];
        } else {
            int next = Integer.MAX_VALUE;
            if (x != X - 1) next = Math.min(next, dfs(x + 1, y));
            if (y != Y - 1) next = Math.min(next, dfs(x, y + 1));
            dp[x][y] = grid[x][y] + next;
        }
        return dp[x][y];
    }
}
