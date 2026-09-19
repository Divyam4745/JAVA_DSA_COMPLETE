class Solution {
    public int numDecodings(String s) {
        // Base checks
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int prev2 = 1;
        int prev1 = 1;
        int n = s.length();

        for (int i = 1; i < n; i++) {
            int current = 0;
            char currChar = s.charAt(i);
            char prevChar = s.charAt(i - 1);

            // 1. One digit decoding
            if (currChar != '0') {
                current = prev1; 
            }

            // 2. Two digit decoding (checking characters directly)
            if (prevChar == '1' || (prevChar == '2' && currChar <= '6')) {
                current += prev2;
            }

            // 3. Early exit for invalid sequences like "30", "40", "00"
            if (current == 0) {
                return 0;
            }

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}