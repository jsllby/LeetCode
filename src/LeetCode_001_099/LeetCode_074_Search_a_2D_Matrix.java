package LeetCode_001_099;

public class LeetCode_074_Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int left = 0, right = matrix.length;
        while (left < right - 1) {
            int middle = left + (right - left) / 2;
            if (matrix[middle][0] == target) return true;
            else if (matrix[middle][0] > target) right = middle;
            else left = middle;
        }
        int row = left;
        left = 0;
        right = matrix[0].length;
        while (left < right - 1) {
            int middle = left + (right - left) / 2;
            if (matrix[row][middle] == target) return true;
            else if (matrix[row][middle] > target) right = middle;
            else left = middle;
        }
        return matrix[row][left] == target;
    }
}
