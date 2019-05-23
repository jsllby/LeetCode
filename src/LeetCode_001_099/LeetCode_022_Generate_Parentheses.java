package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_022_Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) result.add("");
        else {
            for (int i = 0; i < n; i++) {
                for (String left : generateParenthesis(i)) {
                    for (String right : generateParenthesis(n - i - 1)) result.add("(" + left + ")" + right);
                }
            }
        }
        return result;
    }


//    List<String> result = new ArrayList<>();
//
//    public List<String> generateParenthesis(int n) {
//        helper("", n, 0);
//        return result;
//    }
//
//    void helper(String s, int n, int stack) {
//        if (n == 0) {
//            if (stack == 0) result.add(s);
//            else helper(s + ")", n, stack - 1);
//        } else {
//            helper(s + "(", n - 1, stack + 1);
//            if (stack != 0) helper(s + ")", n, stack - 1);
//        }
//    }
}
