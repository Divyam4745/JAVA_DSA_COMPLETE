class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int n = s1.length();
        int m = s2.length();

        // Length check
        if (n + m != s3.length()) {
            return false;
        }

        // Use the smaller string for the DP array
        if (m > n) {
            String temp = s1;
            s1 = s2;
            s2 = temp;

            int t = n;
            n = m;
            m = t;
        }

        boolean[] dp = new boolean[m + 1];

        dp[0] = true;

        // First row: only s2 is used
        for (int j = 1; j <= m; j++) {
            dp[j] = dp[j - 1] &&
                    s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Remaining rows
        for (int i = 1; i <= n; i++) {

            // First column: only s1 is used
            dp[0] = dp[0] &&
                    s1.charAt(i - 1) == s3.charAt(i - 1);

            for (int j = 1; j <= m; j++) {

                char target = s3.charAt(i + j - 1);

                // Take character from s1
                boolean fromS1 = dp[j] &&
                        s1.charAt(i - 1) == target;

                // Take character from s2
                boolean fromS2 = dp[j - 1] &&
                        s2.charAt(j - 1) == target;

                dp[j] = fromS1 || fromS2;
            }
        }

        return dp[m];
    }
}