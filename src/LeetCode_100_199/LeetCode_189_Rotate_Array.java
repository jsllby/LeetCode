package LeetCode_100_199;

public class LeetCode_189_Rotate_Array {
    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[end];
            nums[end--] = nums[start];
            nums[start++] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
//        4.
//        k = k % nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0,k-1);
//        reverse(nums,k,nums.length-1);

//        3.
//        int length = nums.length;
//        k = k % length;
//        int count = 0;
//        for (int start = 0; count < length; start++) {
//            int current = start;
//            int memory = nums[start];
//            do {
//                current = (current + k) % length;
//                int temp = nums[current];
//                nums[current] = memory;
//                memory = temp;
//                count++;
//            } while (start != current);
//        }


//        2.
//        int length = nums.length;
//        k = k % length;
//        int[] result = new int[length];
//        for (int i = 0; i < length; i++) {
//            System.out.println(i+" "+(length + i - k));
//            result[i] = nums[(length + i - k)%length];
//        }
//        for(int i =0;i<length;i++){
//            nums[i] = result[i];
//        }

//        1.
//        k = k % nums.length;
//        int[] temp = new int[k];
//        System.arraycopy(nums,nums.length-k,temp,0,k);
//        System.arraycopy(nums,0,nums,k,nums.length-k);
//        System.arraycopy(temp,0,nums,0,k);
    }
}
