package LeetCode_001_099;

public class LeetCode_038_Count_and_Say {
    StringBuilder helper(StringBuilder s) {
        StringBuilder result = new StringBuilder();
        char cur = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != cur) {
                result.append(Integer.toString(count)).append(cur);
                cur = s.charAt(i);
                count = 1;
            } else count++;
        }
        result.append(Integer.toString(count)).append(cur);
        return result;
    }

    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        result.append('1');
        while (n-- > 1) result = helper(result);
        return result.toString();
    }
}
