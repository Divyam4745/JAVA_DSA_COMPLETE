import java.util.Arrays;

class Solution {
    private static final int MOD = 1_000_000_007;

    private int m, n;
    private int[][] grid;
    private int[][] dp;

    public int uniquePaths(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(0, 0);
    }

    private int dfs(int r, int c) {
        if (r == m - 1 && c == n - 1) {
            return 1;
        }

        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        long ways = 0;

        // Move right
        ways += move(r, c, 0);

        // Move down
        ways += move(r, c, 1);

        return dp[r][c] = (int) (ways % MOD);
    }

    private int move(int r, int c, int direction) {
        int nr = r;
        int nc = c;

        if (direction == 0) {
            nc++;
        } else {
            nr++;
        }

        while (nr >= 0 && nr < m && nc >= 0 && nc < n) {

            // Empty cell
            if (grid[nr][nc] == 0) {
                return dfs(nr, nc);
            }

            // Mirror reflection
            if (direction == 0) {
                direction = 1;
                nr++;
            } else {
                direction = 0;
                nc++;
            }
        }

        // Invalid path
        return 0;
    }
}