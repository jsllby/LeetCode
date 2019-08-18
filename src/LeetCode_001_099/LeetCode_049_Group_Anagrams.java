package LeetCode_001_099;

import java.util.*;

public class LeetCode_049_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new LinkedList<>(map.values());
    }
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> res = new ArrayList<>();
//        for (String s : strs) {
//            boolean exist = false;
//            for (int i = 0; i < res.size(); i++) {
//                if (isAnagrams(res.get(i).get(0), s)) {
//                    exist = true;
//                    res.get(i).add(s);
//                    break;
//                }
//            }
//            if (!exist) {
//                List<String> temp = new ArrayList<>();
//                temp.add(s);
//                res.add(temp);
//            }
//        }
//        return res;
//    }
//
//    boolean isAnagrams(String l, String s) {
//        if (l.length() != s.length()) return false;
//        int[] compare = new int[26];
//        Arrays.fill(compare, 0);
//        for (int i = 0; i < l.length(); i++) compare[(int) (l.charAt(i) - 'a')] += 1;
//        for (int i = 0; i < s.length(); i++) compare[(int) (s.charAt(i) - 'a')] -= 1;
//        for (int i = 0; i < 26; i++) {
//            if (compare[i] != 0) return false;
//        }
//        return true;
//    }
}
