package LeetCode_100_199;

public class LeetCode_153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {

        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])   return nums[i+1];
        }
        return nums[0];
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if(nums[mid]<nums[right])   right = mid;
//            else left = mid+1;
//        }
//        return nums[left];

//        if (nums[0] <= nums[nums.length - 1]) return nums[0];
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
//            if(nums[mid]>nums[0])   left = mid+1;
//            else right = mid;
//        }
//        return -1;
    }
}
