package LeetCode_200_299;

public class LeetCode_278_First_Bad_Version {
    boolean isBadVersion(int x) {
        if (x < 2147483647) return false;
        return true;
    }

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;

//        int left = 1;
//        int right = n;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (!isBadVersion(mid)) {
//                if (isBadVersion(mid + 1) == true) return mid + 1;
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
    }
}
