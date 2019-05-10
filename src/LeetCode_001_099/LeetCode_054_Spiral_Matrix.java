package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

class LeetCode_054_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, left = 0;
        int bottom = matrix.length - 1;
        if (bottom < 0) return result;
        int right = matrix[0].length - 1;

        // 1.
//        int x = 0, y = 0, size = (bottom + 1) * (right + 1);
//        int[] direction = {0, 1}; //{0,1}, {0,-1}, {1,0}, {-1,0}
//        for (int i = 0; i < size; i++) {
//            result.add(matrix[x][y]);
//            System.out.println("top = " + top + ",right = " + right + ",bottom = " + bottom + ", left = " + left + ", value = " + matrix[x][y] + ", [" + direction[0] + "," + direction[1] + "]");
//            x += direction[0];
//            y += direction[1];
//            if (y > right) {
//                x++;
//                y--;
//                top += 1;
//                direction[0] = 1;
//                direction[1] = 0;
//            } else if (x > bottom) {
//                x--;
//                y--;
//                right -= 1;
//                direction[0] = 0;
//                direction[1] = -1;
//            } else if (y < left) {
//                x--;
//                y++;
//                bottom -= 1;
//                direction[0] = -1;
//                direction[1] = 0;
//            } else if (x < top) {
//                x++;
//                y++;
//                left += 1;
//                direction[0] = 0;
//                direction[1] = 1;
//            }
//        }

        // 2.
        int dir = 0;
        while (left <= right && top <= bottom) {
            switch (dir) {
                case 0:
                    for (int i = left; i <= right; i++) {
                        result.add(matrix[top][i]);
                    }
                    top++;
                    break;
                case 1:
                    for (int i = top; i <= bottom; i++) {
                        result.add(matrix[i][right]);
                    }
                    right--;
                    break;
                case 2:
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                    break;
                case 3:
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                    break;
            }
            dir = (dir + 1) % 4;
        }

        return result;
    }
}
