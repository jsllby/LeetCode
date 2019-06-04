package LeetCode_001_099;

public class LeetCode_035_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]>=target)   right = mid;
            else    left = mid+1;
        }
        return left;

//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) return mid;
//            else if (nums[mid] > target) right = mid - 1;
//            else left = mid + 1;
//        }
//        return left;
    }
}
