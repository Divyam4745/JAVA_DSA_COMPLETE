
class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        int LOG = 32 - Integer.numberOfLeadingZeros(n);

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Step 1: Find next greater element
        int[] next = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && nums[stack[top]] <= nums[i]) {
                top--;
            }

            next[i] = (top == -1) ? n : stack[top];
            stack[++top] = i;
        }

        // Step 2: Binary lifting tables
        int[][] up = new int[LOG][n];
        long[][] sum = new long[LOG][n];

        for (int i = 0; i < n; i++) {
            up[0][i] = next[i];

            int end = next[i] - 1;

            sum[0][i] =
                (long) nums[i] * (end - i + 1)
                - (prefix[end + 1] - prefix[i]);
        }

        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i < n; i++) {
                int mid = up[j - 1][i];

                if (mid < n) {
                    up[j][i] = up[j - 1][mid];
                    sum[j][i] =
                        sum[j - 1][i] + sum[j - 1][mid];
                } else {
                    up[j][i] = n;
                    sum[j][i] = sum[j - 1][i];
                }
            }
        }

        // Step 3: Calculate minimum operations
        // required for subarray [l, r]
        long answer = 0;

        for (int r = 0; r < n; r++) {
            int low = 0;
            int high = r;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                long operations = 0;
                int cur = mid;

                // Jump through complete maximum blocks
                for (int j = LOG - 1; j >= 0; j--) {
                    if (cur < n && up[j][cur] <= r) {
                        operations += sum[j][cur];
                        cur = up[j][cur];
                    }
                }

                // Calculate the remaining partial block
                operations +=
                    (long) nums[cur] * (r - cur + 1)
                    - (prefix[r + 1] - prefix[cur]);

                if (operations <= k) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            answer += r - low + 1;
        }

        return answer;
    }
}
