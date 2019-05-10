package LeetCode_001_099;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_003_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {

        int length = 0, start = 0, i = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (i = start; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                length = Math.max(length, i - start);
                int index = map.get(s.charAt(i--));
                for (int x = start; x <= index; x++) map.remove(s.charAt(x));
                start = index + 1;
            } else {
                map.put(s.charAt(i), i);
            }
        }
        if (i == s.length()) length = Math.max(length, i - start);
        return length;

//        int length = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        int start = 0;
//        while (start < s.length()) {
//            int i;
//            for (i = start; i < s.length(); i++) {
//                if (map.containsKey(s.charAt(i))) {
//                    length = Math.max(length, i - start);
//                    start = map.get(s.charAt(i))+1;
//                    map.clear();
//                    break;
//                } else {
//                    map.put(s.charAt(i), i);
//                }
//            }
//            if(i==s.length())   length = Math.max(length, i-start)
//        }
//        System.out.println(length);
//        return length;
    }
}
