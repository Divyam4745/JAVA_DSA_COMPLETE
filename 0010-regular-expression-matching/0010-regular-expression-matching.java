class Solution {
    // 0 = uncalculated, 1 = true, -1 = false
    byte[][] memo;

    public boolean isMatch(String s, String p) {
        // Use primitive byte array for raw speed and minimal memory
        memo = new byte[s.length() + 1][p.length() + 1];
        return dfs(0, 0, s.toCharArray(), p.toCharArray());
    }

    private boolean dfs(int i, int j, char[] s, char[] p) {
        // Return precalculated result immediately
        if (memo[i][j] != 0) {
            return memo[i][j] == 1;
        }

        boolean ans;
        
        if (j == p.length) {
            ans = (i == s.length);
        } else {
            boolean firstMatch = (i < s.length && (p[j] == s[i] || p[j] == '.'));

            if (j + 1 < p.length && p[j + 1] == '*') {
                // Short-circuit evaluation: if dfs(i, j+2) is true, the second half is skipped entirely
                ans = (dfs(i, j + 2, s, p) || (firstMatch && dfs(i + 1, j, s, p)));
            } else {
                ans = firstMatch && dfs(i + 1, j + 1, s, p);
            }
        }

        // Save result as 1 (true) or -1 (false)
        memo[i][j] = (byte) (ans ? 1 : -1);
        return ans;
    }
}