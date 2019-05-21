package LeetCode_001_099;

public class LeetCode_010_Regular_Expression_Matching {
    enum Result {
        TRUE, FALSE
    }

    Result[][] dp;

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        for (int i = s.length(); i >= 0; i--) {
            for (int j = p.length(); j >= 0; j--) {
                boolean result;
                if (j == p.length()) result = (i == s.length());
                else {
                    boolean first_match = i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i));
                    if (j + 1 < p.length() && p.charAt(j + 1) == '*')
                        result = dp[i][j + 2] || (first_match && dp[i + 1][j]);
                    else   result = first_match&&dp[i+1][j+1];
                }
                dp[i][j] = result;
            }
        }
        return dp[0][0];
    }


//    public boolean isMatch(String s, String p) {
//        dp = new Result[s.length() + 1][p.length() + 1];
//        return helper(0, 0, s, p);
//    }
//
//    public boolean helper(int i, int j, String s, String p) {
//        if (dp[i][j] != null) return dp[i][j] == Result.TRUE;
//
//        boolean result;
//        if (j == p.length()) result = (i == s.length());
//        else {
//            boolean first_match = i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i));
//            if (j + 1 < p.length() && p.charAt(j + 1) == '*')
//                result = helper(i, j + 2, s, p) || (first_match && helper(i + 1, j, s, p));
//            else result = first_match && helper(i + 1, j + 1, s, p);
//        }
//
//        dp[i][j] = result ? Result.TRUE : Result.FALSE;
//        return result;
//    }

//    int[][] dp;
//
//    public boolean isMatch(String s, String p) {
//        dp = new int[s.length() + 1][p.length() + 1];
//        for (int i = 0; i <= s.length(); i++) {
//            for (int j = 0; j <= p.length(); j++) {
//                dp[i][j] = -1;
//            }
//        }
//        return helper(0, 0, s, p);
//
//    }

//    public boolean helper(String s, String p) {
//        if (dp[s.length()][p.length()] == 1) return true;
//        if (dp[s.length()][p.length()] == 0) return false;
//
//        if (p == null || p.length() == 0) {
//            if (s == null || s.length() == 0) {
//                dp[0][0] = 1;
//                return true;
//            }
//            dp[s.length()][0] = 0;
//            return false;
//        }
//
//        if (p.length() > 1 && p.charAt(1) == '*') {
//            boolean next = helper(s, p.substring(2));
//            if (s == null || s.length() == 0) return next;
//            if (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) next = next || helper(s.substring(1), p);
//            if (next == true) dp[s.length()][p.length()] = 1;
//            else dp[s.length()][p.length()] = 0;
//            return next;
//        } else {
//            if (s.length() == 0 || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))) {
//                dp[s.length()][p.length()] = 0;
//                return false;
//            }
//            return helper(s.substring(1), p.substring(1));
//        }
//    }
}
