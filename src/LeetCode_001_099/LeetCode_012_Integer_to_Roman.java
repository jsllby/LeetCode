package LeetCode_001_099;

public class LeetCode_012_Integer_to_Roman {
    public String intToRoman(int num) {
//        String[] M = {"", "M", "MM", "MMM"};
//        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int cur = 0;
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            if(num>=value[cur]){
                result.append(roman[cur]);
                num -= value[cur];
            }
            else    cur++;
        }
        return result.toString();
    }
}
