package LeetCode_001_099;

public class LeetCode_032_Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {

        int left = 0, right = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else {
                right++;
                if (right > left) {
                    left = right = 0;
                } else if (left == right) {
                    max = Math.max(right * 2, max);
                }
            }
        }
        if (right == left) return max;

        left = 0;
        right = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ')') right++;
            else {
                left++;
                if (left > right) {
                    left = right = 0;
                } else if (left == right) {
                    max = Math.max(right * 2, max);
                }
            }
        }
        return max;

//        int max = 0;
//        int[] dp = new int[s.length()];
//        Arrays.fill(dp, 0);
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == ')') {
//                if (s.charAt(i - 1) == ')') {
//                    if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
//                        dp[i] = 2 + dp[i - 1] + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
//                    }
//                } else {
//                    dp[i] = 2 + (i - 2 > 0 ? dp[i - 2] : 0);
//                }
//            }
//            max = Math.max(dp[i], max);
//        }
//        return max;


//        int max = 0;
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1);   // stack 的最底层表示最后一个没有被匹配到的符号的下标
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') stack.push(i);
//            else {
//                stack.pop(); //匹配到
//                if (stack.isEmpty()) {
//                    stack.push(i); // 有一个）和-1匹配了，表示s[i]其实是未匹配的
//                } else {
//                    max = Math.max(i - stack.peek(), max);
//                }
//            }
//        }
//        return max;
    }
}
