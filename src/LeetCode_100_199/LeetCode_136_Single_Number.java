package LeetCode_100_199;

public class LeetCode_136_Single_Number {
    public int singleNumber(int[] nums) {
//        1.暴力
//        for (int i = 0; i < nums.length; i++) {
//            boolean single = true;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i != j) {
//                    single = false;
//                    break;
//                }
//            }
//            if (single == true) {
//                return nums[i];
//            }
//        }

//        2.Time:O(n)  Space:O(n)
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            if(map.containsKey(i)){
//                map.remove(i);
//            }
//            else{
//                map.put(i,1);
//            }
//        }
//        for(int key:map.keySet()){
//            return key;
//        }

//        3.
//        int setSum = 0, sum = 0;
//        Set<Integer> set = new TreeSet<>();
//        for (int i : nums) {
//            sum += i;
//            set.add(i);
//        }
//
//        for(int i:set){
//            setSum+=i;
//        }
//
//        return 2*setSum-sum;

//        4.
        int a = 0;
        for(int i:nums){
            a = a^i;
        }
        return a;

//        return 0;


    }
}
