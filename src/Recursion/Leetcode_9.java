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
        // Base case: if amount becomes 0, we found a valid combination
        if (amount == 0) {
            return 1;
        }

        // Base case: if amount becomes negative or no more coins to use
        if (amount < 0 || index >= coins.length) {
            return 0;
        }

        // Return cached result if already calculated
        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }

        // Include current coin (use it) vs Exclude current coin (skip it)
        int include = solve(amount - coins[index], coins, index, dp);
        int exclude = solve(amount, coins, index + 1, dp);

        // Store the result in the DP table and return
        return dp[index][amount] = include + exclude;
    }
}

public class Leetcode_9 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int amount1 = 5;
        int[] coins1 = { 1, 2, 5 };
        System.out.println("Amount: " + amount1);
        System.out.println("Coins: " + Arrays.toString(coins1));
        System.out.println("Number of combinations: " + solution.change(amount1, coins1));
        System.out.println();

        // Test case 2
        int amount2 = 3;
        int[] coins2 = { 2 };
        System.out.println("Amount: " + amount2);
        System.out.println("Coins: " + Arrays.toString(coins2));
        System.out.println("Number of combinations: " + solution.change(amount2, coins2));
        System.out.println();

        // Test case 3
        int amount3 = 10;
        int[] coins3 = { 10 };
        System.out.println("Amount: " + amount3);
        System.out.println("Coins: " + Arrays.toString(coins3));
        System.out.println("Number of combinations: " + solution.change(amount3, coins3));
    }
}

