package LeetCode_001_099;

public class LeetCode_069_Sqrt_x {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        long middle = 0;
        while (left <= right) {
            middle = left + ((right - left) >> 2);
            long square = middle * middle;
            if(square==x) return (int)middle;
            else if(square>x)   right=middle-1;
            else left = middle+1;
        }
        return (int)right;

//        if (x <= 1) return x;
//        int left = 2;
//        int right = x;
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
//            if (x / middle < middle) right = middle - 1;
//            else if (x / (middle + 1) >= middle + 1) left = middle + 1;
//            else return middle;
//        }
//        return -1;
    }
}
