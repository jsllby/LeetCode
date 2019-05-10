package LeetCode_001_099;

public class LeetCode_027_Remove_Element {
    public int removeElement(int[] nums, int val) {

        int cur = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[cur++] = nums[i];
            }
        }
        return cur;

//        int length = nums.length;
//        int cur = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==val){
//                length--;
//            }else {
//                nums[cur++] = nums[i];
//            }
//        }
//        return length;
    }
}
