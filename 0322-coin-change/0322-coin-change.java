class Solution {

    static int solve(int amount, int[] coins, int index, int[][] dp) {

        // Base case
        if (amount == 0) {
            return 0;
        }

        // No solution
        if (amount < 0 || index >= coins.length) {
            return Integer.MAX_VALUE;
        }

        // Already calculated
        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }

        // Include
        int includekaAns = solve(amount - coins[index], coins, index, dp);

        if (includekaAns != Integer.MAX_VALUE) {
            includekaAns = 1 + includekaAns;
        }

        // Exclude
        int excludekaAns = solve(amount, coins, index + 1, dp);

        dp[index][amount] = Math.min(includekaAns, excludekaAns);

        return dp[index][amount];
    }

    public int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        int[][] dp = new int[coins.length][amount + 1];

        // Fill with -1
        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(amount, coins, 0, dp);

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }
}