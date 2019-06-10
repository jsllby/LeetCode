package LeetCode_001_099;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_078_Subsets {
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        int num = 1 << nums.length;
//        for (int i = 0; i < num; i++) {
//            List<Integer> temp = new ArrayList<>();
//            for (int j = 0; j < nums.length; j++) {
//                if ((i >> j & 1) == 1) temp.add(nums[j]);
//            }
//            result.add(temp);
//        }
//        return result;


//        List<List<Integer>> result = new ArrayList<>();
//        result.add(new ArrayList<>());
//        for (int i = 0; i < nums.length; i++) {
//            int size = result.size();
//            for (int j = 0; j < size; j++) {
//                List<Integer> temp = new ArrayList<>(result.get(j));
//                temp.add(nums[i]);
//                result.add(temp);
//            }
//        }
//        return result;
//    }

    List<List<Integer>> result = new ArrayList<>();


    void helper(List<Integer> pre, int[] nums, int cur) {
        if (cur == nums.length){
            result.add(new ArrayList<>(pre));
            return;
        }
        helper(pre, nums, cur + 1);
        pre.add(nums[cur]);
        helper(pre, nums, cur + 1);
        pre.remove(pre.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        helper(new ArrayList<>(), nums, 0);
        return result;
    }
}
