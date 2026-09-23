class Solution {
    public boolean isMatch(String s, String p) {
        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();
        int m = sc.length;
        int n = pc.length;
        
        // We only need a 1D array of size n + 1 to store the previous row's state
        boolean[] dp = new boolean[n + 1];
        
        // Base case setting for i = m (when the string s is exhausted)
        dp[n] = true; 
        for (int j = n - 1; j >= 0; j--) {
            // If we have a '*', we can skip the character and the '*' itself
            if (j + 1 < n && pc[j + 1] == '*') {
                dp[j] = dp[j + 2];
            }
        }
        
        // Bottom-up evaluation (from i = m - 1 down to 0)
        for (int i = m - 1; i >= 0; i--) {
            // 'next' represents dp[i+1][j+1] (the diagonal value) from the old row
            boolean next = dp[n]; 
            
            // An empty pattern can never match a non-empty remaining string
            dp[n] = false; 
            
            for (int j = n - 1; j >= 0; j--) {
                // 'temp' caches the current dp[j] (which is effectively dp[i+1][j]) 
                // before we overwrite it for the current row.
                boolean temp = dp[j]; 
                
                boolean firstMatch = (pc[j] == sc[i] || pc[j] == '.');
                
                if (j + 1 < n && pc[j + 1] == '*') {
                    // dp[j + 2] comes from the current row (already calculated in this loop)
                    // temp comes from the previous row (i+1)
                    dp[j] = dp[j + 2] || (firstMatch && temp);
                } else {
                    // 'next' comes from the diagonal (i+1, j+1)
                    dp[j] = firstMatch && next;
                }
                
                // Advance 'next' to act as the diagonal for the next column calculation
                next = temp;
            }
        }
        
        return dp[0];
    }
}