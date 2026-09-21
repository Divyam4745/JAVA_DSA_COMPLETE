import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // 1. Sort the array to easily skip duplicates and enable early stopping
        Arrays.sort(candidates); 
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int remain, int start) {
        // Base Case 1: Target reached
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Optimization 1: Skip duplicates at the same level of the recursion tree
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; 
            }

            // Optimization 2: Early termination. Since the array is sorted, 
            // if the current element exceeds the remaining target, all subsequent ones will too.
            if (candidates[i] > remain) {
                break; 
            }

            // Choose
            current.add(candidates[i]);
            
            // Explore (i + 1 ensures we don't reuse the same element)
            backtrack(result, current, candidates, remain - candidates[i], i + 1);
            
            // Un-choose (Backtrack)
            current.remove(current.size() - 1);
        }
    }
}