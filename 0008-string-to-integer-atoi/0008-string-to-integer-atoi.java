
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Determine sign
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Accumulate digits as a negative number
        int result = 0;
        int limit = (sign == -1)
                ? Integer.MIN_VALUE
                : -Integer.MAX_VALUE;
        int multMin = limit / 10;

        while (i < n) {
            char c = s.charAt(i);

            if (c < '0' || c > '9') {
                break;
            }

            int digit = c - '0';

            if (result < multMin) {
                return sign == -1
                        ? Integer.MIN_VALUE
                        : Integer.MAX_VALUE;
            }

            result *= 10;

            if (result < limit + digit) {
                return sign == -1
                        ? Integer.MIN_VALUE
                        : Integer.MAX_VALUE;
            }

            result -= digit;
            i++;
        }

        // Convert negative accumulation to the correct result
        return sign == -1 ? result : -result;
    }
}
