package LeetCode_100_199;

public class LeetCode_167_Two_Sum_II_Input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        // 3. O(n)
        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        while(true){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

//        // 2.
//        int x, y;
//        int[] result = new int[2];
//        for (x = 0; ; x++) {
//            for (y = x + 1; y < numbers.length && numbers[x] + numbers[y] <= target; y++) {
//                if (numbers[x] + numbers[y] == target) {
//                    result[0] = x + 1;
//                    result[1] = y + 1;
//                    return result;
//                }
//            }
//        }


//        // 1.
//        int i, j;
//        int[] result = new int[2];
//        for (i = 0; ; i++) {
//            for (j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    result[0] = i+1;
//                    result[1] = j+1;
//                    return result;
//                }
//            }
//        }
    }
}
