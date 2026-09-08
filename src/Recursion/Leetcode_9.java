package Recursion;

import java.util.Arrays;

class Solution {
    public int change(int amount, int[] coins) {
        // Create a DP table initialized to -1
        // Rows: index of coin (0 to coins.length)
        // Columns: amount remaining (0 to amount)
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(amount, coins, 0, dp);
    }

    private int solve(int amount, int[] coins, int index, int[][] dp) {
        // Base cases
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (index >= coins.length) {
            return 0;
        }

        // Return cached result if already calculated
        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }

        // Include vs Exclude choices
        int include = solve(amount - coins[index], coins, index, dp);
        int exclude = solve(amount, coins, index + 1, dp);

        // Store the result in the DP table and return
        return dp[index][amount] = include + exclude;
    }
}

