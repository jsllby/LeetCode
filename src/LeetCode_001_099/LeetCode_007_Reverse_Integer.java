package LeetCode_001_099;

public class LeetCode_007_Reverse_Integer {
    public int reverse(int x) {
        int result = 0, temp = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if((result-x%10)/10!=temp)  return 0;
            temp = result;
            x = x/10;
        }
        return result;


//        long result = 0;
//        while (x != 0) {
//            result = result * 10 + x % 10;
//            x = x/10;
//            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)  return 0;
//        }
//        return (int)result;


//        int result = 0;
//        while (Math.abs(x) >= 10) {
//            if (x >= 0 && result > (Integer.MAX_VALUE / 10 - x % 10)) return 0;
//            if (x < 0 && result < (Integer.MIN_VALUE / 10 - x % 10)) return 0;
//            result += x % 10;
//            x = x / 10;
//            result *= 10;
//        }
//        if (x >= 0 && result > (Integer.MAX_VALUE - x)) return 0;
//        if (x < 0 && result < (Integer.MIN_VALUE - x)) return 0;
//        return result + x;


    }
}
