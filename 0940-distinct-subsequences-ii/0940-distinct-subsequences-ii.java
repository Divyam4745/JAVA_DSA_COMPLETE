class Solution {
    public int distinctSubseqII(String s) {

        int MOD = 1000000007;

        // dp = number of distinct subsequences including empty subsequence
        long dp = 1;

        // Stores dp value before the previous occurrence of each character
        long[] last = new long[26];

        for (char ch : s.toCharArray()) {

            int index = ch - 'a';

            long newDp = (2 * dp) % MOD;

            // Remove duplicates created by this character
            newDp = (newDp - last[index] + MOD) % MOD;

            // Save current dp for future duplicate removal
            last[index] = dp;

            dp = newDp;
        }

        // Remove the empty subsequence
        return (int) ((dp - 1 + MOD) % MOD);
    }
}