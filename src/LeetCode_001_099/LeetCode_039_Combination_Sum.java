package LeetCode_001_099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_039_Combination_Sum {
    List<List<Integer>> result = new ArrayList<>();

    void helper(List<Integer> pre, int[] candidates, int start, int target) {
        if (start == candidates.length) return;
        int cur = candidates[start];
        if (cur == target) {
            pre.add(cur);
            result.add(new ArrayList<>(pre));
            pre.remove(pre.size() - 1);
        } else if (cur < target) {
            helper(pre, candidates, start + 1, target);
            pre.add(cur);
            helper(pre, candidates, start, target - cur);
            pre.remove(pre.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(new ArrayList<>(), candidates, 0, target);
        return result;
    }
}
