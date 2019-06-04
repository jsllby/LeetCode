package LeetCode_001_099;

public class LeetCode_029_Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = -1;

        int quotient = 0, product = divisor, multiplier = sign;
        if (sign < 0) product = -product;

        while (dividend == Integer.MIN_VALUE || (divisor != Integer.MIN_VALUE && Math.abs(dividend) >= Math.abs(divisor))) {
            while (dividend == Integer.MIN_VALUE || (product != Integer.MIN_VALUE && Math.abs(dividend) >= Math.abs(product))) {
                dividend -= product;
                quotient += multiplier;
                if ((product > 0 && (product <= Integer.MAX_VALUE - product)) || (product < 0 && (product >= Integer.MIN_VALUE - product))) {
                    product <<= 1;
                    multiplier <<= 1;
                }
            }
            product >>= 1;
            multiplier >>= 1;
        }
        return quotient;
    }
}
