package LeetCode_001_099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_046_Permutations {

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        res.add(new ArrayList<>());
//        for (int i = 0; i < nums.length; i++) {
//            int size = res.size();
//            for (; size > 0; size--) {
//                List<Integer> temp = new ArrayList<>(res.get(0));
//                res.remove(0);
//                for (int j = 0; j <= i; j++) {
//                    List<Integer> s = new ArrayList<>(temp);
//                    s.add(j, nums[i]);
//                    res.add(s);
//                }
//            }
//        }
//        return res;
//    }

//    List<List<Integer>> res = new ArrayList<>();
//
//    public List<List<Integer>> permute(int[] nums) {
//        List<Integer> cur = new ArrayList<>();
//        helper(cur, nums);
//        return res;
//    }
//
//
//    // 优化  Time = O(n!)
//    void helper(List<Integer> cur, int[] nums) {
//        if (cur.size() == nums.length) {
//            res.add(new ArrayList<>(cur));
//        } else {
//            for (int i = cur.size(); i < nums.length; i++) {
//                int temp = nums[i];
//                nums[i] = nums[cur.size()];
//                nums[cur.size()] = temp;
//
//                cur.add(nums[cur.size()]);
//                helper(cur, nums);
//                cur.remove(cur.size() - 1);
//
//                temp = nums[i];
//                nums[i] = nums[cur.size()];
//                nums[cur.size()] = temp;
//            }
//        }
//    }

    // Time = O(n*n!)
//    void helper(List<Integer> cur, int[] nums) {
//        if (cur.size() == nums.length) {
//            res.add(new ArrayList<>(cur));
//        } else {
//            for (int i = 0; i < nums.length; i++) {
//                boolean exist = false;
//                for (int j = 0; j < cur.size(); j++) {
//                    if (cur.get(j) == nums[i]) {
//                        exist = true;
//                        break;
//                    }
//                }
//                if (!exist) {
//                    cur.add(nums[i]);
//                    helper(cur, nums);
//                    cur.remove(cur.size() - 1);
//                }
//            }
//        }
//    }

    // to be improved
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean end = nums.length == 0;
        while (!end) {
            List<Integer> list = new ArrayList<>();
            for (int x : nums) list.add(x);
            res.add(list);

            for (int i = nums.length - 1; i >= 0; i--) {
                if (i == 0) {
                    end = true;
                    break;
                }
                if (nums[i] > nums[i - 1]) {
                    int index = i;
                    for (int j = i; j < nums.length; j++) {
                        if (nums[j] > nums[i - 1] && nums[j] < nums[index]) index = j;
                    }
                    int temp = nums[index];
                    nums[index] = nums[i - 1];
                    nums[i - 1] = temp;
                    Arrays.sort(nums, i, nums.length);
                    break;
                }
            }
        }
        return res;
    }
}
