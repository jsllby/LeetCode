package LeetCode_400_499;

import java.util.ArrayList;
import java.util.List;

class LeetCode_498_Diagonal_Traverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int n = 0;
        int m = matrix.length;

        if (m > 0) n = matrix[0].length;
        int[] result = new int[m * n];
        int x = 0, y = 0, direction = 1;  //y's direction

        for (int i = 0; i < result.length; i++) {
            System.out.println("i = " + i + ", x = " + x + ", y = " + y + ", direction = " + direction);
            result[i] = matrix[x][y];

            // 1.
//            x -= direction;
//            y += direction;
//            if (x < 0) {
//                x++;
//                direction *= -1;
//                if (y == n) {
//                    x++;
//                    y--;
//                }
//            } else if (y < 0) {
//                y++;
//                direction *= -1;
//                if (x == m) {
//                    y++;
//                    x--;
//                }
//            } else if (x == m) {
//                direction *= -1;
//                x--;
//                y += 2;
//            } else if (y == n) {
//                direction *= -1;
//                y--;
//                x += 2;
//            }

            // 2.
            if (direction == 1) {
                if (y + 1 > n - 1) {
                    x++;
                    direction *= -1;
                } else if (x - 1 < 0) {
                    y++;
                    direction *= -1;
                } else {
                    x--;
                    y++;
                }
            } else {
                if (x + 1 > m - 1) {
                    y++;
                    direction *= -1;
                } else if (y - 1 < 0) {
                    x++;
                    direction *= -1;
                } else {
                    x++;
                    y--;
                }

            }
        }
        return result;
    }
}

