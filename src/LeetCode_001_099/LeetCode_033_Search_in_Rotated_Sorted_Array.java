package LeetCode_001_099;

public class LeetCode_033_Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] >= nums[left]) {
                if (target > nums[middle] || target < nums[left]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (target > nums[right] || target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;

//        if (nums == null || nums.length == 0) return -1;
//        int left = 0, right = nums.length - 1, pivot = 0;
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
//            if (middle == nums.length - 1 || nums[middle] > nums[middle + 1]) {
//                pivot = (middle + 1) % nums.length;
//                break;
//            } else if (nums[middle] >= nums[0]) left = middle + 1;
//            else right = middle - 1;
//        }
////        System.out.println(pivot);
//        left = 0;
//        right = nums.length - 1;
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
//            int index = (middle + pivot) % nums.length;
//            if (nums[index] == target) return index;
//            else if (nums[index] < target) left = middle + 1;
//            else right = middle - 1;
//        }
//        return -1;
    }
}
