package LeetCode_001_099;

import java.util.Arrays;

public class LeetCode_043_Multiply_Strings {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];
        Arrays.fill(result, 0);
        for (int i = num2.length() - 1; i >= 0; i--) {
            for (int j = num1.length() - 1; j >= 0; j--) {
                result[i + j + 1] = (num2.charAt(i) - '0') * (num1.charAt(j) - '0') + result[i + j + 1];
            }
        }

        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] >= 10) {
                result[i - 1] += result[i] / 10;
                result[i] = result[i] % 10;
            }
        }

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (!(s.length() == 0 && result[i] == 0)) s.append((char) (result[i] + '0'));
        }
        return s.length()==0?"0":s.toString();



//        int[] result = new int[num1.length() + num2.length()];
//        Arrays.fill(result, 0);
//        for (int i = num2.length() - 1; i >= 0; i--) {
//            for (int j = num1.length() - 1; j >= 0; j--) {
//                int temp = (num2.charAt(i) - '0') * (num1.charAt(j) - '0') + result[i + j + 1];
//                result[i + j + 1] = temp % 10;
//                result[i + j] += temp / 10;
//            }
//        }
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < result.length; i++) {
//            if (!(s.length() == 0 && result[i] == 0)) s.append((char) (result[i] + '0'));
//        }
//        return s.length()==0?"0":s.toString();


//        if((num1.length()==1&&num1.charAt(0)=='0')||(num2.length()==1&&num2.charAt(0)=='0'))    return "0";
//        if(num2.length()>num1.length()){
//            String temp = num2;
//            num2 = num1;
//            num1 = temp;
//        }
//        StringBuilder result = new StringBuilder();
//        int end = 1,carry = 0;
//        for (int i = num2.length() - 1; i >= 0; i--) {
//            carry = 0;
//            int cur = num2.length() - 1 - i;
//            for (int j = num1.length() - 1; j >= 0; j--) {
//                int temp = (num2.charAt(i) - '0') * (num1.charAt(j) - '0')+carry;
//                if (result.length() <= cur) {
//                    result.insert(0, (char) (temp % 10 + '0'));
//                } else {
//                    temp += result.charAt(result.length() - 1 - cur) - '0';
//                    result.setCharAt(result.length() - 1 - cur, (char) (temp % 10 + '0'));
//                }
//                carry = temp / 10;
//                cur++;
//            }
//            if(carry!=0){
//                result.insert(0,(char)(carry+'0'));
//            }
//        }
//        while (result.length() != 1 && result.charAt(0) == '0') result.deleteCharAt(0);
//        return result.toString();
    }
}
