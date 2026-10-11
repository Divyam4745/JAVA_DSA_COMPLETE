
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;

        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Determine the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits and check overflow
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;

            // Step 4: Clamp to 32-bit integer range
            if (sign * num <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (sign * num >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return (int) (sign * num);
    }
}
