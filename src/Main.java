import structure.ListNode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String s1 = "adceb";
//        String s2 = "*a*b";
//        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution temp = new Solution();
        temp.solveNQueens(4);
        return;
    }
}


class Solution {

    // 已经通过，是否有其他方法？未整理
    List<List<String>> res = new ArrayList<>();
    StringBuilder temp = new StringBuilder();

    public List<List<String>> solveNQueens(int n) {
        int[] pos = new int[n];
        int[] column = new int[n], left = new int[2 * n], right = new int[2 * n];
        for (int i = 0; i < n - 1; i++) temp.append('.');
        helper(pos, n, column, left, right, 0);
        return res;
    }

    void helper(int[] pos, int n, int[] column, int[] left_diag, int[] right_diag, int queens) {
        if (queens == n) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder s = new StringBuilder(temp);
                s.insert(pos[i], 'Q');
                result.add(s.toString());
            }
            res.add(result);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (column[i] != 1) {
                int left = queens <= i ? i - queens : queens - i + n;
                int right = queens + i < n ? queens + i : queens + i + 1;
                if (left_diag[left] != 1 && right_diag[right] != 1) {
                    pos[queens] = i;
                    column[i] = 1;
                    left_diag[left] = 1;
                    right_diag[right] = 1;
                    helper(pos, n, column, left_diag, right_diag, queens + 1);
                    column[i] = 0;
                    left_diag[left] = 0;
                    right_diag[right] = 0;
                }
            }
//            if (!map.containsKey(i)) {
//                pos[queens] = i;
//                map.put(i, 1);
//                helper(pos, n, map, queens + 1);
//                map.remove(i);
////                pos[queens] = -1;
//            }
        }
        return;
    }
}



