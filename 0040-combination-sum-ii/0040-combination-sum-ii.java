import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int remain, int start,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Since the array is sorted, no later value can work
            if (nums[i] > remain) {
                break;
            }

            current.add(nums[i]);

            backtrack(nums, remain - nums[i], i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }
}