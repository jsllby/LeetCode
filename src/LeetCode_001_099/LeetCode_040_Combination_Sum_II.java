package LeetCode_001_099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_040_Combination_Sum_II {
    List<List<Integer>> result = new ArrayList<>();

    void helper(List<Integer> pre, int[] candidates, int start, int target) {
        if (start == candidates.length) return;
        int cur = candidates[start];
        if (cur == target) {
            pre.add(cur);
            result.add(new ArrayList<>(pre));
            pre.remove(pre.size() - 1);
        } else if (cur < target) {
            int next = start+1;
            while(next<candidates.length&&candidates[next]==candidates[start])  next++;
            helper(pre, candidates, next, target);
            pre.add(cur);
            helper(pre, candidates, start + 1, target - cur);
            pre.remove(pre.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(new ArrayList<>(), candidates, 0, target);
        return result;
    }
}
