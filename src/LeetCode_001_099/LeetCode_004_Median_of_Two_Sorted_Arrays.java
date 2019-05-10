package LeetCode_001_099;

public class LeetCode_004_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int left = Math.max(0, (m - n + 1) / 2);
        int right = Math.min(m, (m + n + 1) / 2);
        while (true) {
            int i = left + (right - left) / 2;
            int j = (m + n + 1) / 2 - i;

            if (i != 0 && j != n && A[i - 1] > B[j]) {
                right = i - 1;
            } else if (i != m && j != 0 && A[i] < B[j - 1]) {
                left = i + 1;
            } else {
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

                if (i != 0) max = A[i - 1];
                if (j != 0) max = max > B[j - 1] ? max : B[j - 1];

                if (i != m) min = A[i];
                if (j != n) min = min < B[j] ? min : B[j];

                if ((m + n) % 2 == 0) return (double) (max + min) / 2;
                else return (double) max;
            }
        }
    }
}
