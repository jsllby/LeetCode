package LeetCode_001_099;

public class LeetCode_031_Next_Permutation {
    void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
        return;
    }

    public void nextPermutation(int[] nums) {
        int peak = nums.length - 1;
        while (peak > 0 && nums[peak - 1] >= nums[peak]) peak--;
        if (peak == 0) reverse(nums, 0, nums.length - 1);
        else {
            int end = nums.length - 1;
            while (nums[end] <= nums[peak - 1]) end--;
            int temp = nums[end];
            nums[end] = nums[peak-1];
            nums[peak-1] = temp;
            reverse(nums, peak, nums.length - 1);
        }
        return;
    }
}
