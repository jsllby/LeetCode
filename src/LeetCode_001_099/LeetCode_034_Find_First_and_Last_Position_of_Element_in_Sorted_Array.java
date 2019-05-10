package LeetCode_001_099;

public class LeetCode_034_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int firstEqualGreater(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public int[] searchRange(int[] nums, int target) {

//        4.使用1个二分查找算法， overflow may happen
        int start = firstEqualGreater(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = firstEqualGreater(nums, target + 1);
        System.out.println(start + " " + end);
        return new int[]{start, end - 1};

//        1. 先找到最左，然后向右遍历
//        int[] pos = {-1, -1};
//        if (nums == null || nums.length == 0) return pos;
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) left = mid + 1;
//            else right = mid;
//        }
//
//        if (nums[left] == target) {
//            pos[0] = left;
//            for (int i = left + 1; i < nums.length; i++) {
//                if (nums[i] != target) {
//                    pos[1] = i - 1;
//                    break;
//                }
//            }
//            if (pos[1] == -1) pos[1] = nums.length - 1;
//        }
//        return pos;

//        2.同1，只是二分查找用的模版不一样
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                int start = mid;
//                for (; start >= 0; start--) {
//                    if (nums[start] < target) {
//                        start++;
//                        break;
//                    }
//                }
//                if (start < 0) start = 0;
//
//                int end = mid;
//                for (; end < nums.length; end++) {
//                    if (nums[end] > target) {
//                        end--;
//                        break;
//                    }
//                }
//                if (end == nums.length) end = nums.length - 1;
//                System.out.println(start + " " + end);
//                return new int[]{start, end};
//            } else if (nums[mid] < target) left = mid + 1;
//            else right = mid - 1;
//        }
//        return new int[]{-1, -1};

//        3. 2次查找，分别找出最左和最右
//        int[] pos = {-1,-1};
//        if(nums==null || nums.length==0)    return pos;
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) left = mid + 1;
//            else if (nums[mid] >= target) right = mid;
//        }
//        if (nums[left] == target) pos[0] = left;
//
//        left = 0;
//        right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid + 1] > target) right = mid;
//            else left = mid + 1;
//        }
//        if (nums[left] == target) pos[1] = left;
//        for (int x : pos) System.out.println(x);
//        return pos;
    }
}
