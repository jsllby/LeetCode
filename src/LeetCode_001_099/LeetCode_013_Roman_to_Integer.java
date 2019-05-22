package LeetCode_001_099;

public class LeetCode_013_Roman_to_Integer {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'C':
                    result+=100;
                    if (i + 1 < s.length()) {
                        if (s.charAt(i+1) == 'M') {
                            result += 800;
                            i++;
                        } else if (s.charAt(i+1) == 'D') {
                            result += 300;
                            i++;
                        }
                    }
                    break;
                case 'X':
                    result+=10;
                    if (i + 1 < s.length()) {
                        if (s.charAt(i+1) == 'C') {
                            result += 80;
                            i++;
                        } else if (s.charAt(i+1) == 'L') {
                            result += 30;
                            i++;
                        }
                    }
                    break;
                case 'I':
                    result+=1;
                    if (i + 1 < s.length()) {
                        if (s.charAt(i+1) == 'X') {
                            result += 8;
                            i++;
                        } else if (s.charAt(i+1) == 'V') {
                            result += 3;
                            i++;
                        }
                    }
                    break;
            }
        }


        return 0;


//        int result = 0;
//        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//        int cur = 0;
//        int i = 0;
//        while (i<s.length()) {
//            if (roman[cur].length() == 1) {
//                if (s.charAt(i) == roman[cur].charAt(0)) {
//                    result += value[cur];
//                    i++;
//                } else cur++;
//            } else {
//                if (s.charAt(i) == roman[cur].charAt(0) && (i + 1 < s.length() && s.charAt(i + 1) == roman[cur].charAt(1))) {
//                    result += value[cur];
//                    i += 2;
//                } else cur++;
//            }
//        }


//        int cur = 0;
//        for (int i = 0; i < s.length(); i++) {
//            while (s.charAt(i) != roman[cur].charAt(0) || (roman[cur].length() == 2 && (i + 1 == s.length() || s.charAt(i + 1) != roman[cur].charAt(1))))
//                cur++;
//
//            result += value[cur];
//            if (roman[cur].length() == 2) i++;
//        }
//        return result;
    }
}
