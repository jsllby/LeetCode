package LeetCode_001_099;

public class LeetCode_052_N_Queens_II {
    int res = 0;

    public int totalNQueens(int n) {
        int pos[] = new int[n]; //the column of queens on each row
        placeQueen(pos, n, 0);
        return res;
    }

    void placeQueen(int[] pos, int n, int row) {
        if (row == n)   // all the queens are in place
            res++;
        else {
            for (int i = 0; i < n; i++) {
                if (isValid(pos, row, i)) {
                    pos[row] = i;       // put queen at(row,i)
                    placeQueen(pos, n, row + 1);  // try to put next queen
                }
            }
        }
    }

    boolean isValid(int[] pos, int row, int column) {
        for (int i = 0; i < row; i++)
            if (pos[i] == column || Math.abs(i - row) == Math.abs(column - pos[i])) return false;
        return true;
    }
}
