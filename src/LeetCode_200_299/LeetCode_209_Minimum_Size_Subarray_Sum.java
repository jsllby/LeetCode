package LeetCode_200_299;

public class LeetCode_209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int length = nums.length + 1;

        while (right < nums.length) {
            sum += nums[right++];
            while (sum >= s) {
                length = Math.min(length, right - left);
                sum -= nums[left++];
            }
        }
        if (length == nums.length + 1) length = 0;
        return length;

//        if (nums.length == 0) return 0;
//        int left = 0, right = 0;
//        int sum = nums[left];
//        int length = nums.length + 1;
//
//        while (left <= right && right < nums.length) {
//            if (sum >= s) {
//                if (right - left + 1 < length) length = right - left + 1;
//                sum -= nums[left];
//                left++;
//                if (right < left) right = left;
//            } else {
//                right++;
//                if (right < nums.length) sum += nums[right];
//            }
//        }
//        if (length == nums.length + 1) length = 0;
//        return length;
    }
}
