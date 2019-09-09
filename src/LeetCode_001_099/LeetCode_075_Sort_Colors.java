package LeetCode_001_099;

public class LeetCode_075_Sort_Colors {
    public void sortColors(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        for (int i = 0; i < nums.length && i <= right; i++) {
//            if (nums[i] == 0) swap(nums, i, left++);
//            else if (nums[i] == 1) swap(nums, i--, right--);
//        }

        int end0 = 0, end1 = 0, end2 = 0; // the end of each partition
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                nums[end2++] = 2;
                nums[end1++] = 1;
                nums[end0++] = 0;
            }
            else if(nums[i]==1){
                nums[end2++] = 2;
                nums[end1++] = 1;
            }
            else    nums[end2++] = 2;
        }
        return;

    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return;
    }
}
