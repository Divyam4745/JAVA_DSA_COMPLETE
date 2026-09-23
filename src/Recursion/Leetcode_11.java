import java.util.List;

class Solution {

    static int solve(List<List<Integer>> triangle, int rowIndex, int colIndex, int[][] memo) {

        // Base case
        if (rowIndex == triangle.size() - 1) {
            return triangle.get(rowIndex).get(colIndex);
        }

        // Check memo
        if (memo[rowIndex][colIndex] != Integer.MAX_VALUE) {
            return memo[rowIndex][colIndex];
        }

        // Move down
        int downAns = solve(triangle, rowIndex + 1, colIndex, memo);

        // Move diagonally
        int diagonalAns = solve(triangle, rowIndex + 1, colIndex + 1, memo);

        // Current value + minimum of down and diagonal
        memo[rowIndex][colIndex] = triangle.get(rowIndex).get(colIndex)
                + Math.min(downAns, diagonalAns);
        return memo[rowIndex][colIndex];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = Integer.MAX_VALUE;
            }
        }
        return solve(triangle, 0, 0, memo);
    }
}