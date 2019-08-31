package LeetCode_001_099;

public class LeetCode_045_Jump_Game_II {
    public int jump(int[] nums) {
        int cur = 0;    // with current step, the farthest position can reach
        int next = 0;  // with current+1 step, the farthest position can reach
        int step = 0;
        for (int i = 0; cur < nums.length - 1; i++) {
            if (i > cur) {
                step++;
                cur = next;
            }
            next = Math.max(next, i + nums[i]);
        }
        return step;

//        int[] count = new int[nums.length];
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (i + nums[i] >= nums.length - 1) count[i] = 1;
//            else {
//                int min = Integer.MAX_VALUE;
//                for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
//                    min = Math.min(count[i + j], min);
//                }
//                count[i] = min == Integer.MAX_VALUE ? min : min + 1;
//            }
//        }
//        return count[0];
    }
}
