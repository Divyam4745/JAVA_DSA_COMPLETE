import java.util.*;

class Solution {
    public List<Integer> findCoins(int[] numWays) {
        int n = numWays.length;

        long[] dp = new long[n + 1];
        dp[0] = 1;

        List<Integer> ans = new ArrayList<>();

        for (int coin = 1; coin <= n; coin++) {

            long target = numWays[coin - 1];

            // Coin is not present
            if (dp[coin] == target) {
                continue;
            }

            // Coin must be present.
            // Adding coin creates exactly one new way
            // to make amount = coin.
            if (dp[coin] + 1 != target) {
                return new ArrayList<>();
            }

            ans.add(coin);

            // Unbounded coin change
            for (int amount = coin; amount <= n; amount++) {
                dp[amount] += dp[amount - coin];
            }
        }

        // Verify
        for (int amount = 1; amount <= n; amount++) {
            if (dp[amount] != numWays[amount - 1]) {
                return new ArrayList<>();
            }
        }

        return ans;
    }
}