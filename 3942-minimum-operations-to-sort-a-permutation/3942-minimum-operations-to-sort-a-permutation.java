class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int k = 0; k < n; k++) {
            boolean sorted = true;

            // Check left rotation by k positions
            for (int i = 0; i < n; i++) {
                if (nums[(i + k) % n] != i) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                ans = Math.min(ans, Math.min(k, n - k + 2));
            }

            // Check whether reversing after k rotations sorts the array
            sorted = true;

            for (int i = 0; i < n; i++) {
                if (nums[(n - 1 - i + k + n) % n] != i) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                ans = Math.min(ans, Math.min(k + 1, n - k + 1));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}