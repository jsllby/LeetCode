package LeetCode_001_099;

import java.util.Arrays;

public class LeetCode_073_Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        boolean column = false;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) column = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        if (matrix[0][0] == 0) Arrays.fill(matrix[0], 0);
        if (column) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }

//        int[] row = new int[m], column = new int[n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    row[i]++;
//                    column[j]++;
//                }
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            if (row[i] != 0) Arrays.fill(matrix[i], 0);
//            for (int j = 0; j < m; j++) {
//                if (column[j] != 0) matrix[i][j] = 0;
//            }
//        }
        return;
    }
}
