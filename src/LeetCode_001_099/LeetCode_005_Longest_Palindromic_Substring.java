package LeetCode_001_099;

import java.util.Arrays;

public class LeetCode_005_Longest_Palindromic_Substring {
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

        // Method 2 I don't know the time complexity of it?  == It's O(n*n), as there are 2n-1 centers, and it needs n to check.
//        if (s == null || s.length() == 0) return "";
//        for (int i = 0; i < s.length(); i++) {
//            helper(s, i, i);
//            helper(s, i, i + 1);
//        }
//        return s.substring(start, end + 1);

        // Method 3 Dynamic programming with time complexity O(n*n)
//        if (s == null || s.length() == 0) return "";
//        boolean[][] dp = new boolean[s.length()][s.length()];
//        int start = 0, end = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            for (int j = i; j < s.length(); j++) {
//                if (j == i) dp[i][j] = true;
//                else if (s.charAt(j) == s.charAt(i)) dp[i][j] = j == i + 1 ? true : dp[i + 1][j - 1];
//                if (dp[i][j] == true && j - i > end - start) {
//                    start = i;
//                    end = j;
//                }
//            }
//        }
//        return s.substring(start, end + 1);

        // Improve the space of Method 3
//        if (s == null || s.length() == 0) return "";
//        boolean[] dp = new boolean[s.length()];
//        int start = 0, end = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            for (int j = s.length() - 1; j >= i; j--) {
//                if (j == i) dp[j] = true;
//                else if (s.charAt(j) == s.charAt(i)) dp[j] = j == i + 1 ? true : dp[j - 1];
//                else dp[j] = false;
//                if (dp[j] == true && j - i > end - start) {
//                    start = i;
//                    end = j;
//                }
//            }
//        }
//        return s.substring(start, end + 1);

        // Method 4 Manacher's Algorithm: Acturally this is slower than expanding(Method 2)
        if (s == null || s.length() == 0) return "";
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            t.append('#');
            t.append(s.charAt(i));
        }
        t.append('#');
        int[] p = new int[t.length()];
        Arrays.fill(p, 0);

        int center = 0, max = 0, right = 0;
        for (int i = 1; i < t.length() - 1; i++) {

            if (i <= right) {
                int j = 2 * center - i;
                p[i] = Math.min(p[j], right - i);
            }
            while ((i + p[i] + 1) < t.length() && (i - p[i] - 1) >= 0 && t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1))
                p[i]++;
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
            if (p[i] > p[max]) max = i;
        }
        return s.substring((max - p[max]) / 2, (max + p[max]) / 2);
    }
}
