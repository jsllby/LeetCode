package LeetCode_001_099;

public class LeetCode_058_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end-start;
    }
}
