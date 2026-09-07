class Solution {
    public int numTrees(int m) {

        int[] dp = new int[m + 1];

        // 0 nodes -> 1 possible BST
        dp[0] = 1;

        // 1 node -> 1 possible BST
        dp[1] = 1;

        for (int nodes = 2; nodes <= m; nodes++) {

            // Try every node as root
            for (int root = 1; root <= nodes; root++) {

                int left = root - 1;
                int right = nodes - root;

                dp[nodes] += dp[left] * dp[right];
            }
        }

        return dp[m];
    }
}