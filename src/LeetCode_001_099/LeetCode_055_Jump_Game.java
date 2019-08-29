package LeetCode_001_099;

public class LeetCode_055_Jump_Game {
    public boolean canJump(int[] nums) {
//        int end = 0;
//        for (int i = 0; i <= end; i++) {
//            end = Math.max(end, i + nums[i]);
//            if(end>=nums.length-1)  return true;
//        }
//        return false;

        int leftMostGood = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--)
            if (i + nums[i] >= leftMostGood) leftMostGood = i;

        return leftMostGood == 0;

//        int cur = nums.length - 1;
//        while (cur!=0) {
//            int before;
//            for (before = 0; before < cur; before++)
//                if (before + nums[before] >= cur) break;
//            if (before >= cur) return false;
//            cur = before;
//        }
//        return true;
    }
}
