package LeetCode_400_499;

public class LeetCode_485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i - temp - 1 > length) length = i - temp - 1;
                temp = i;
            }
            System.out.println("i = " + i + ", temp = " + temp + ", length = " + length);
        }
        if (nums.length - temp - 1 > length) length = nums.length - temp - 1;
        return length;
    }
}
