import java.util.Arrays;

class Solution {

    static int solve(int[] nums, int index, int[] dp) {

        // Base case
        if (index >= nums.length) {
            return 0;
        }

        // Already calculated
        if (dp[index] != -1) {
            return dp[index];
        }

        // Include
        int includes = nums[index] + solve(nums, index + 2, dp);

        // Exclude
        int exclude = solve(nums, index + 1, dp);

        // Store answer
        dp[index] = Math.max(includes, exclude);

        return dp[index];
    }

    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return solve(nums, 0, dp);
    }
}