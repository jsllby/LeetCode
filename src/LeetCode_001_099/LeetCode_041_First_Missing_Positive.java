package LeetCode_001_099;

public class LeetCode_041_First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) return 1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= 0 || nums[i] > nums.length || nums[i] == i + 1 || nums[nums[i] - 1] == nums[i]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }
        i = 0;
        while (i < nums.length && nums[i] == i - 1) i++;
        return i + 1;
    }
}
