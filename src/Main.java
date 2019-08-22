import structure.ListNode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String s1 = "adceb";
//        String s2 = "*a*b";
//        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution temp = new Solution();
        temp.longestPalindrome("cbbd");
        return;
    }
}


class Solution {
    private int start = 0, end = 0;

    void helper(String s, int left, int right) {  // with method 2
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (right - left - 2 > end - start) {
            start = left + 1;
            end = right - 1;
        }
        return;
    }

    public String longestPalindrome(String s) {
        // Method 1 with O(n*n*n)
//        if (s == null || s.length() == 0) return "";
//        int start = 0, end = 0;
//        for (int left = 0; left < s.length(); left++) {
//            for (int right = left; right < s.length(); right++) {
//                if (right - left <= end - start) continue;
//                int i = left, j = right;
//                while (s.charAt(i) == s.charAt(j) && i < j) {
//                    i++;
//                    j--;
//                }
//                if (i <= j) {
//                    start = left;
//                    end = right;
//                }
//            }
//        }
//        return s.substring(start, end + 1);

        // Method 2 I don't know the time complexity of it?
//        if (s == null || s.length() == 0) return "";
//        for (int i = 0; i < s.length(); i++) {
//            helper(s, i, i);
//            helper(s, i, i + 1);
//        }
//        return s.substring(start, end + 1);

        // Method 3 Dynamic programming
        if (s == null || s.length() == 0) return "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0, end = 0;
        for (int i = s.length(); i >= 0; i++) {
            for (int j = i; j < s.length(); j++) {
                if (j == i) dp[i][j] = true;
                else if (s.charAt(j) == s.charAt(i)) dp[i][j] = j == i + 1 ? true : dp[i + 1][j - 1];
                if (dp[i][j] == true && j - i > end - start) {
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end + 1);

    }

//    // 已经通过，是否有其他方法？未整理
//    List<List<String>> res = new ArrayList<>();
//    StringBuilder temp = new StringBuilder();
//
//    public List<List<String>> solveNQueens(int n) {
//        int[] pos = new int[n];
//        int[] column = new int[n], left = new int[2 * n], right = new int[2 * n];
//        for (int i = 0; i < n - 1; i++) temp.append('.');
//        helper(pos, n, column, left, right, 0);
//        return res;
//    }
//
//    void helper(int[] pos, int n, int[] column, int[] left_diag, int[] right_diag, int queens) {
//        if (queens == n) {
//            List<String> result = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                StringBuilder s = new StringBuilder(temp);
//                s.insert(pos[i], 'Q');
//                result.add(s.toString());
//            }
//            res.add(result);
//            return;
//        }
//        for (int i = 0; i < n; i++) {
//            if (column[i] != 1) {
//                int left = queens <= i ? i - queens : queens - i + n;
//                int right = queens + i < n ? queens + i : queens + i + 1;
//                if (left_diag[left] != 1 && right_diag[right] != 1) {
//                    pos[queens] = i;
//                    column[i] = 1;
//                    left_diag[left] = 1;
//                    right_diag[right] = 1;
//                    helper(pos, n, column, left_diag, right_diag, queens + 1);
//                    column[i] = 0;
//                    left_diag[left] = 0;
//                    right_diag[right] = 0;
//                }
//            }
////            if (!map.containsKey(i)) {
////                pos[queens] = i;
////                map.put(i, 1);
////                helper(pos, n, map, queens + 1);
////                map.remove(i);
//////                pos[queens] = -1;
////            }
//        }
//        return;
//    }
}



