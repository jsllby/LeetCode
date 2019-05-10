package LeetCode_100_199;

public class LeetCode_162_Find_Peak_Element {
    //这方法太机智了
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }



//    public int findPeakElement(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if(nums[mid]<nums[mid+1]){
//                left = mid+1;
//            }
//            else{
//                right = mid;
//            }
//        }
//        return left;
//    }
}
