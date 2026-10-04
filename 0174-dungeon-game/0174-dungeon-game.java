import java.util.Arrays;

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        
        // dp[j] represents the minimum health required to safely enter 
        // the cell at column j in the current row we are processing.
        int[] dp = new int[n + 1];
        
        // Initialize with MAX_VALUE to represent out-of-bounds walls.
        // This ensures the Math.min() logic forces the path inwards.
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        // Base condition: The "dummy" cell immediately below the princess.
        // The knight needs at least 1 health after defeating the final room.
        dp[n - 1] = 1;
        
        // Traverse the grid in reverse: bottom-to-top, right-to-left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // The minimum health required on exit is the lesser of 
                // going DOWN (dp[j]) or going RIGHT (dp[j+1])
                int minHealthOnExit = Math.min(dp[j], dp[j + 1]);
                
                // Calculate health needed before entering the current room.
                // If a room has a huge health potion, the calculation might drop <= 0,
                // but the knight must always have at least 1 health at all times.
                dp[j] = Math.max(1, minHealthOnExit - dungeon[i][j]);
            }
        }
        
        // The answer bubbles up to the starting position
        return dp[0];
    }
}