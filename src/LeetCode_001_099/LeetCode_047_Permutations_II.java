package LeetCode_001_099;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_047_Permutations_II {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        helper(cur, nums);
        return res;
    }

    void helper(List<Integer> cur, int[] nums) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
        } else {
            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int i = cur.size(); i < nums.length; i++) {
                if (map.containsKey(nums[i])) continue;
                map.put(nums[i], true);
//                boolean repeat = false;
//                for (int j = cur.size(); j < i; j++) {
//                    if (nums[i] == nums[j]) {
//                        repeat = true;
//                        break;
//                    }
//                }
//                if (repeat) continue;
                int temp = nums[i];
                nums[i] = nums[cur.size()];
                nums[cur.size()] = temp;

                cur.add(nums[cur.size()]);
                helper(cur, nums);
                cur.remove(cur.size() - 1);

                temp = nums[i];
                nums[i] = nums[cur.size()];
                nums[cur.size()] = temp;
            }
        }
    }
}
