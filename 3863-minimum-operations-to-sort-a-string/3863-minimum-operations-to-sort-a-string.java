class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        // 1. Check if the string is already sorted
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            return 0;
        }
        
        // 2. If the string is of length 2 and not sorted, it's impossible
        if (n == 2) {
            return -1;
        }
        
        // Find the maximum and minimum characters
        char maxChar = 'a';
        char minChar = 'z';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c > maxChar) maxChar = c;
            if (c < minChar) minChar = c;
        }
        
        // 3. Check if 1 operation is enough
        if (s.charAt(n - 1) == maxChar || s.charAt(0) == minChar) {
            return 1;
        }
        
        // Count occurrences of maxChar and minChar
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == maxChar) maxCount++;
            if (s.charAt(i) == minChar) minCount++;
        }
        
        // 4. Check the unique edge case that strictly requires 3 operations
        // Max character uniquely trapped at the start AND Min character uniquely trapped at the end
        if (s.charAt(0) == maxChar && maxCount == 1 && 
            s.charAt(n - 1) == minChar && minCount == 1) {
            return 3;
        }
        
        // 5. Everything else takes 2 operations
        return 2;
    }
}