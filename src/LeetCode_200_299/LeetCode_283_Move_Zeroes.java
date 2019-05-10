package LeetCode_200_299;

public class LeetCode_283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
//        2.
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != cur) {
                    nums[cur] = nums[i];
                    nums[i] = 0;
                }
                cur++;
            }
        }

//        1.
//        int cur = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[cur++] = nums[i];
//            }
//        }
//        for (int i = cur; i < nums.length; i++) nums[i] = 0;
    }
}
