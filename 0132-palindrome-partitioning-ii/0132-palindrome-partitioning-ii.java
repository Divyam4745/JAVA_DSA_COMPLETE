class Solution {
    public int minCut(String s) {
        int n = s.length();
        if (n <= 1) return 0;

        // Use char array for faster indexing instead of s.charAt()
        char[] c = s.toCharArray();
        int[] dp = new int[n + 1];

        // dp[i] represents the minimum cuts for a prefix of length i
        for (int i = 0; i <= n; i++) {
            dp[i] = i - 1;
        }

        // Expand palindromes by their ending position
        for (int center = 0; center < n; center++) {

            // Odd-length palindromes
            for (int l = center, r = center; l >= 0 && r < n && c[l] == c[r]; l--, r++) {
                if (dp[l] + 1 < dp[r + 1]) {
                    dp[r + 1] = dp[l] + 1;
                }
            }

            // Even-length palindromes
            for (int l = center, r = center + 1; l >= 0 && r < n && c[l] == c[r]; l--, r++) {
                if (dp[l] + 1 < dp[r + 1]) {
                    dp[r + 1] = dp[l] + 1;
                }
            }
        }

        return dp[n];
    }
}