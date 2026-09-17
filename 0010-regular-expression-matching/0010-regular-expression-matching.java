class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // Convert to char arrays for faster access
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();

        // Only store the previous row and the current row
        boolean[] prev = new boolean[n + 1];
        boolean[] curr = new boolean[n + 1];

        // Empty string matches empty pattern
        prev[0] = true;

        // Base case: patterns like a*, a*b*, a*b*c* matching an empty string
        for (int j = 2; j <= n; j++) {
            if (pArr[j - 1] == '*') {
                prev[j] = prev[j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            // A non-empty string will never match an empty pattern
            curr[0] = false; 
            char sc = sArr[i - 1];

            for (int j = 1; j <= n; j++) {
                char pc = pArr[j - 1];

                if (pc == '.' || pc == sc) {
                    curr[j] = prev[j - 1];
                } 
                else if (pc == '*') {
                    // '*' matches zero occurrences
                    curr[j] = curr[j - 2];
                    
                    char prevChar = pArr[j - 2];
                    // '*' matches one or more occurrences
                    if (prevChar == '.' || prevChar == sc) {
                        curr[j] = curr[j] || prev[j];
                    }
                } 
                else {
                    // Mismatched characters
                    curr[j] = false; 
                }
            }
            
            // Swap prev and curr for the next iteration (reusing memory)
            boolean[] temp = prev;
            prev = curr;
            curr = temp;
        }

        // Because we swap at the end of the loop, the final answer rests in 'prev'
        return prev[n];
    }
}