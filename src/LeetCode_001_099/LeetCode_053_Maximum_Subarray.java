package LeetCode_001_099;

import java.util.Arrays;

public class LeetCode_053_Maximum_Subarray {
    //    public int maxSubArray(int[] nums) {
//        if (nums == null || nums.length == 0) return 0;
//        int pre = nums[0];
//        int max = pre;
//        for (int i = 1; i < nums.length; i++) {
//            if (pre > 0) pre += nums[i];
//            else    pre = nums[i];
//            if (pre > max) max = pre;
//        }
//        return max;
//    }

    public int maxSubArray(int[] nums) {
        return helper(nums)[3];
    }

    int[] helper(int[] nums) {
        if (nums.length == 1) {
            int[] res = new int[4];
            for(int i=0;i<4;i++)    res[i] = nums[0];
            return res;
        }
        int mid = nums.length / 2;
        int[] left_res = helper(Arrays.copyOfRange(nums, 0, mid));
        int[] right_res = helper(Arrays.copyOfRange(nums, mid, nums.length));
        int left = Math.max(left_res[0], left_res[2] + right_res[0]);
        int right = Math.max(right_res[1], left_res[1] + right_res[2]);
        int sum = left_res[2] + right_res[2];

        int max = Math.max(left_res[3],right_res[3]);
        max = Math.max(max, left_res[1]+right_res[0]);

        int[] res = new int[4];
        res[0] = left;
        res[1] = right;
        res[2] = sum;
        res[3] = max;
        return res;
    }


//    public int maxSubArray(int[] nums) {
//        if (nums.length == 0) return Integer.MIN_VALUE;
//        if (nums.length == 1) return nums[0];
//
//        int mid = nums.length / 2;
//        int left = maxSubArray(Arrays.copyOfRange(nums, 0, mid));
//        int right = maxSubArray(Arrays.copyOfRange(nums, mid + 1, nums.length));
//
//        int max = Math.max(left, right);
//
//        int sum = 0, left_max = 0, right_max = 0;
//        for (int i = mid - 1; i >= 0; i--) {
//            sum += nums[i];
//            left_max = Math.max(left_max, sum);
//        }
//        sum = 0;
//        for (int i = mid + 1; i < nums.length; i++) {
//            sum += nums[i];
//            right_max = Math.max(right_max, sum);
//        }
//
//        sum = nums[mid];
//        if (left_max > 0) sum += left_max;
//        if (right_max > 0) sum += right_max;
//
//        max = Math.max(max, sum);
//        return max;
//    }
}
