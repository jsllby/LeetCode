package LeetCode_001_099;

public class LeetCode_059_Spiral_Matrix_II {
    int[][] result;

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0, left = 0, bottom = n - 1, right = n - 1;
        int cur = 1;
        int dir = 0;
        while (left <= right && top <= bottom) {
            switch (dir) {
                case 0:
                    for (int i = left; i <= right; i++) result[top][i] = cur++;
                    top++;
                    break;
                case 1:
                    for (int i = top; i <= bottom; i++) result[i][right] = cur++;
                    right--;
                    break;
                case 2:
                    for (int i = right; i >= left; i--) result[bottom][i] = cur++;
                    bottom--;
                    break;
                case 3:
                    for (int i = bottom; i >= top; i--) result[i][left] = cur++;
                    left++;
                    break;
            }
            dir = (dir + 1) % 4;
        }

//        result = new int[n][n];
//        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//        int dir = 0;
//
//        int x = 0, y = 0, end = n * n;
//        for (int i = 1; i <= end; i++) {
//            result[x][y] = i;
//            if (!isValid(x, y, direction[dir], n)) dir = (dir + 1) % 4;
//            x += direction[dir][0];
//            y += direction[dir][1];
//        }
        return result;
    }

    boolean isValid(int x, int y, int[] dir, int n) {
        x += dir[0];
        y += dir[1];
        if (result[x][y] != 0 || x < 0 || x == n || y < 0 || y >= n) return false;
        return true;
    }

}
