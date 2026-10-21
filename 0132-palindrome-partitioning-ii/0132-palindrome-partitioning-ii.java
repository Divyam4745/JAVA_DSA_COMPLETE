
class Solution {
    public int minCut(String s) {
        int n = s.length();
        if (n <= 1) return 0;

        boolean[][] palindrome = new boolean[n][n];
        int[] dp = new int[n + 1];

        // Maximum cuts for a prefix of length i
        for (int i = 0; i <= n; i++) {
            dp[i] = i - 1;
        }

        // Expand palindromes by their ending position
        for (int center = 0; center < n; center++) {

            // Odd-length palindromes
            for (int l = center, r = center;
                 l >= 0 && r < n && s.charAt(l) == s.charAt(r);
                 l--, r++) {

                palindrome[l][r] = true;
                dp[r + 1] = Math.min(dp[r + 1], dp[l] + 1);
            }

            // Even-length palindromes
            for (int l = center, r = center + 1;
                 l >= 0 && r < n && s.charAt(l) == s.charAt(r);
                 l--, r++) {

                palindrome[l][r] = true;
                dp[r + 1] = Math.min(dp[r + 1], dp[l] + 1);
            }
        }

        return dp[n];
    }
}
