package LeetCode_001_099;

public class LeetCode_044_Wildcard_Matching {

    public boolean isMatch(String s, String p) {

        //        int i = 0, j = 0, last_i = -1, last_j = -1;
//        while (i < s.length()) {
//
//            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
//                i++;
//                j++;
//            } else if (j < p.length() && p.charAt(j) == '*') {
//                last_j = j++;
//                last_i = i;
//            } else if (last_j != -1) {
//                j = last_j + 1;
//                i = last_i++;
//            } else return false;
//        }
//
//        for (; j < p.length(); j++) {
//            if (p.charAt(j) != '*') return false;
//        }
//        return true;


        boolean match[] = new boolean[p.length() + 1];
        match[0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') match[i + 1] = true;
            else break;
        }

        boolean pre = true;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                boolean temp = match[j + 1];
                if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) match[j + 1] = pre;
                else if (p.charAt(j) == '*') match[j + 1] = match[j + 1] || match[j];
                else match[j + 1] = false;

                if (j == p.length() - 1) pre = false;
                else pre = temp;
            }
            if (p.length() == 0) return false;
        }

        return match[p.length()];

//        boolean match[][] = new boolean[s.length() + 1][p.length() + 1];
//        match[0][0] = true;
//        for (int i = 0; i < p.length(); i++) {
//            if (p.charAt(i) == '*') match[0][i + 1] = true;
//            else break;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < p.length(); j++) {
//
//                if (p.charAt(j) == '*') match[i + 1][j + 1] = match[i][j + 1] || match[i + 1][j];
//                else if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) match[i + 1][j + 1] = pre;
//                else match[i][j] = false;
//            }
//        }
//
//        return match[s.length()][p.length()];


//        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
//        match[s.length()][p.length()] = true;
//        for (int i = p.length() - 1; i >= 0; i--) {
//            if (p.charAt(i) == '*') match[s.length()][i] = true;
//            else break;
//        }
//        for (int i = s.length() - 1; i >= 0; i--) {
//            for (int j = p.length() - 1; j >= 0; j--) {
//                if (p.charAt(j) == '*') match[i][j] = match[i + 1][j] || match[i][j + 1];
//                else if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) match[i][j] = match[i + 1][j + 1];
//                else match[i][j] = false;
//            }
//        }
//        return match[0][0];


//        if(s.length()==0&&p.length()==0)    return true;
//        if(p.length()==0||(s.length()==0&&p.charAt(0)!='*'))    return false;
//        if(p.charAt(0)=='?')    return isMatch(s.substring(1),p.substring(1));
//        else if(p.charAt(0)=='*'){
//            if(s.length()==0){
//                return isMatch(s,p.substring(1));
//            }
//            else{
//                return isMatch(s.substring(1),p)||isMatch(s.substring(1),p.substring(1))||isMatch(s,p.substring(1));
//            }
//        }
//        else    return s.charAt(0)==p.charAt(0)&&isMatch(s.substring(1),p.substring(1));
    }
}
