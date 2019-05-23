package LeetCode_001_099;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_017_Letter_Combinations_of_a_Phone_Number {

    //DFS
//    String[] letter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//    LinkedList<String> result = new LinkedList<>();
//
//    public List<String> letterCombinations(String s) {
//        if (s == null || s.length() == 0) return result;
//        helper("", s);
//        return result;
//    }
//
//    void helper(String combination, String s) {
//        if (s.length() == 0) result.add(combination);
//        else {
//            int num = s.charAt(0) - '0';
//            for (int i = 0; i < letter[num].length(); i++) {
//                helper(combination + letter[num].substring(i, i + 1), s.substring(1));
//            }
//        }
//        return;
//    }

    public List<String> letterCombinations(String s) {
        LinkedList<String> result = new LinkedList<>();
        if (s == null || s.length() == 0) return result;
        String[] letter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        String conbination;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            while (result.peek().length() == i){
                conbination = result.poll();
                for (int j = 0; j < letter[num].length(); j++) {
                    result.add(conbination + letter[num].substring(j, j + 1));
                }
            }
        }
        return result;
    }


    //自底向上
//    public List<String> letterCombinations(String s) {
//        LinkedList<String> result = new LinkedList<>();
//        if (s == null || s.length() == 0) return result;
//        String[] letter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        result.add("");
//        String next;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int num = s.charAt(i) - '0';
//            while (result.peek().length() < (s.length() - i)) {
//                next = result.poll();
//                for (int j = 0; j < letter[num].length(); j++) {
//                    result.add(letter[num].substring(j, j + 1) + next);
//                }
//            }
//        }
//        return result;
//    }


//    char[][] letter = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
//
//    public List<String> letterCombinations(String s) {
//        List<String> result = new ArrayList<>();
//        if (s != null && s.length() != 0) {
//            List<String> next = letterCombinations(s.substring(1));
//            int num = s.charAt(0)-'0';
//            for (int i = 0; i < letter[num].length; i++) {
//                if(next.size()==0)  result.add(String.valueOf(letter[num][i]));
//                for (int j = 0; j < next.size(); j++) {
//                    result.add(letter[num][i] + next.get(j));
//                }
//            }
//        }
//        return result;
//    }
}
