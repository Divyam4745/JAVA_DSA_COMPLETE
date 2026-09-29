class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        if (m == 0) return 0;
        if (n < m) return -1;

        // Step 1: Preprocess the needle to create the LPS array
        // (Longest Proper Prefix which is also Suffix)
        int[] lps = new int[m];
        int prevLPS = 0;
        int i = 1;
        
        while (i < m) {
            if (needle.charAt(i) == needle.charAt(prevLPS)) {
                lps[i] = prevLPS + 1;
                prevLPS++;
                i++;
            } else if (prevLPS == 0) {
                lps[i] = 0;
                i++;
            } else {
                // Fall back to the previous longest prefix
                prevLPS = lps[prevLPS - 1];
            }
        }

        // Step 2: Search the needle in the haystack
        i = 0; // pointer for haystack
        int j = 0; // pointer for needle
        
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    // Mismatch occurred, skip comparisons using LPS array
                    j = lps[j - 1];
                }
            }
            
            // If we found the full needle
            if (j == m) {
                return i - m;
            }
        }
        
        return -1;
    }
}