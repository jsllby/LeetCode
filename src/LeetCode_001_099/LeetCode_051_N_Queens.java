package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_051_N_Queens {
    List<List<String>> res = new ArrayList<>();
    StringBuilder temp = new StringBuilder();

    public List<List<String>> solveNQueens(int n) {
        int pos[] = new int[n]; //the column of queens on each row
        int[] column = new int[n];  //whether the column is occupied
        int[] leftDiag = new int[2 * n - 1], rightDiag = new int[2 * n - 1];    // whether the diagonal line is occupied
        for (int i = 0; i < n - 1; i++) temp.append('.');
        placeQueen(pos, column, leftDiag, rightDiag, n, 0);
        return res;
    }

    void placeQueen(int[] pos, int[] column, int[] leftDiag, int[] rightDiag, int n, int row) {
        if (row == n) {  // all the queens are in place
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++)
                solution.add(new StringBuilder(temp).insert(pos[i], 'Q').toString());
            res.add(solution);
        } else {
            for (int i = 0; i < n; i++) {
                int left = n - 1 - row + i;
                int right = 2 * (n - 1) - row - i;
                if (column[i] == 0 && leftDiag[left] == 0 && rightDiag[right] == 0) {
                    // put queen at(row,i)
                    pos[row] = i;
                    column[i] = 1;
                    leftDiag[left] = 1;
                    rightDiag[right] = 1;

                    // try to put next queen
                    placeQueen(pos, column, leftDiag, rightDiag, n, row + 1);

                    // remove the queen
                    column[i] = 0;
                    leftDiag[left] = 0;
                    rightDiag[right] = 0;
                }
            }
        }
    }
}
