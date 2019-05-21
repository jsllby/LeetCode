package LeetCode_001_099;

public class LeetCode_008_String_to_Integer_atoi {
    public int myAtoi(String s) {
        int result = 0, temp = 0, state = 0, sign = 1;
        for (int i = 0; i < s.length(); i++) {
            if (state == 0) {
                if (s.charAt(i) == '+') {
                    state = 1;
                } else if (s.charAt(i) == '-') {
                    state = 1;
                    sign = -1;
                } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    state = 1;
                    i--;
                } else if (s.charAt(i) == ' ') continue;
                else break;
            } else {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    result = result * 10 + sign * (s.charAt(i) - '0');
                    if (result / 10 != temp) {
                        if (temp < 0) return Integer.MIN_VALUE;
                        else return Integer.MAX_VALUE;
                    }
                    temp = result;
                } else break;
            }
        }
        return result;

//        int index = 0;
//        while (str.charAt(index) == ' ') index++;
//        int sign = 1;
//        if (str.charAt(index) == '+') index++;
//        else if (str.charAt(index++) == '-') sign = -1;
//        else if (str.charAt(index) < '0' && str.charAt(index) > '9') return 0;
//        int res = 0, temp = 0;
//        while (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
//            res += res * 10 + (str.charAt(index++) - '0') * sign;
//            if (res / 10 != temp) {
//                if(res<0)   return Integer.MIN_VALUE;
//                else    return Integer.MAX_VALUE;
//            }
//            temp = res;
//        }
//        return res;
    }
}