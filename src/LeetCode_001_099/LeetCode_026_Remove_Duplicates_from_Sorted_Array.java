package LeetCode_001_099;

public class LeetCode_026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
//        1.
        if(nums.length==0)  return 0;
        int length = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]>nums[length-1]){
                nums[length++] = nums[i];
            }
        }
        return length;

//        2.
//        int length = 0;
//        int value = Integer.MIN_VALUE;
//        for(int i = 0;i<nums.length;i++){
//            if(nums[i] >value){
//                value = nums[i];
//                nums[length++] = value;
//            }
//        }
//        return length;
    }
}
