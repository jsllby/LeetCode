package LeetCode_100_199;

public class LeetCode_151_Reverse_Words_in_a_String {
//    1.
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
                continue;
            }
            int start = s.lastIndexOf(' ', end) + 1;
            result.append(' ');
            result.append(s.substring(start,end+1));
            end = start-1;
        }
        if(result.length()>0)   result.deleteCharAt(0);
        return result.toString();


//        2.
//        StringBuilder result = new StringBuilder();
//        boolean inWord = false, first = true;
//        int end = 0, start = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (inWord == false && s.charAt(i) != ' ') {
//                end = i + 1;
//                inWord = true;
//                for (int j = i - 1; j >= 0; j--) {
//                    if (s.charAt(j) == ' ') {
//                        inWord = false;
//                        start = j + 1;
//                        i = j;
//                        break;
//                    }
//                }
//                if (inWord) {
//                    start = 0;
//                    i = -1;
//                }
//                if (first) first = false;
//                else result.append(" ");
//                result.append(s.substring(start, end));
//            }
//        }
//        return result.toString();

//        3.
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) != ' ') {
//                end = i + 1;
//                for (int j = i - 1; j >= 0; j--) {
//                    if (s.charAt(j) == ' ') {
//                        start = j + 1;
//                        i = j;
//                        break;
//                    }
//                }
//                if (end < start) {
//                    start = 0;
//                    i = -1;
//                }
//                if (flag == 1) {
//                    result.append(" ");
//                } else {
//                    flag = 1;
//                }
//                result.append(s.substring(start, end));
//            }
//        }

    }
}
