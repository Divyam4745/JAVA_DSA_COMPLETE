class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i] represents whether s[0..i-1] matches the pattern processed so far
        boolean[] dp = new boolean[m + 1];
        
        // Base case: an empty pattern matches an empty string
        dp[0] = true;
        
        for (int j = 0; j < n; j++) {
            char pChar = p.charAt(j);
            boolean isStar = (j + 1 < n && p.charAt(j + 1) == '*');
            
            if (isStar) {
                // '*' means zero or more of the preceding character.
                // 0 matches: dp[i] remains true if it was already true.
                // 1+ matches: dp[i] becomes true if dp[i-1] is true and characters match.
                // We iterate left-to-right so a successful match propagates forward.
                for (int i = 1; i <= m; i++) {
                    if (dp[i - 1] && (pChar == '.' || pChar == s.charAt(i - 1))) {
                        dp[i] = true;
                    }
                }
                j++; // Skip the '*' character as it is processed as a pair
            } else {
                // Regular character exact match.
                // We MUST iterate right-to-left to safely read the 'previous row' state 
                // from dp[i-1] before we overwrite it.
                for (int i = m; i >= 1; i--) {
                    dp[i] = dp[i - 1] && (pChar == '.' || pChar == s.charAt(i - 1));
                }
                // An empty string cannot match a single, non-star character
                dp[0] = false; 
            }
        }
        
        return dp[m];
    }
}