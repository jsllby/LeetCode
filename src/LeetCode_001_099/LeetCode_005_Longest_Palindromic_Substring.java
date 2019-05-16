package LeetCode_001_099;

public class LeetCode_005_Longest_Palindromic_Substring {
    private int start = 0, max = 1;

    public void extend(String s, int left, int right) {
        while (true) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > max) {
                max = right - left - 1;
                start = left + 1;
            }
            return;
        }
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        for (int i = 0; i < s.length(); i++) {
            extend(s, i, i);
            extend(s, i, i + 1);

        }
        return s.substring(start, start + max);

//        if (s == null || s.length() == 0) return "";
//        int max = 1, start = 0, end = 1;
//        int[] dp = new int[s.length() + 1];
//        Arrays.fill(dp, 0);
//        for (int i = s.length() - 1; i >= 0; i--) {
//            for (int j = s.length(); j > i; j--) {
//                if (i == j - 1) dp[j] = 1;
//                else if (s.charAt(i) == s.charAt(j-1) && dp[j - 1] != -1) {
//                    dp[j] = dp[j - 1] + 2;
//                    if (dp[j] > max) {
//                        max = dp[j];
//                        start = i;
//                        end = j;
//                    }
//                } else dp[j] = -1;
//            }
//        }
//        return s.substring(start, end);
    }
}
