
import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;

        if (stones[1] != 1) {
            return false;
        }

        // dp[i] stores all jump sizes that can reach stone i
        Map<Integer, Set<Integer>> dp = new HashMap<>();

        for (int stone : stones) {
            dp.put(stone, new HashSet<>());
        }

        dp.get(0).add(0);

        for (int stone : stones) {
            for (int jump : dp.get(stone)) {
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump <= 0) {
                        continue;
                    }

                    int nextStone = stone + nextJump;

                    if (dp.containsKey(nextStone)) {
                        if (nextStone == stones[n - 1]) {
                            return true;
                        }

                        dp.get(nextStone).add(nextJump);
                    }
                }
            }
        }

        return false;
    }
}
