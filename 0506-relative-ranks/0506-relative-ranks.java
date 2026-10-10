
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        Map<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rank = n - i;

            if (rank == 1) {
                rankMap.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sorted[i], "Bronze Medal");
            } else {
                rankMap.put(sorted[i], String.valueOf(rank));
            }
        }

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(score[i]);
        }

        return answer;
    }
}

