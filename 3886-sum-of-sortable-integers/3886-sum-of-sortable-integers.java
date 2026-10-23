class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int answer = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;
            int previousLast = Integer.MIN_VALUE;

            for (int start = 0; start < n; start += k) {
                int end = start + k - 1;
                int drops = 0;
                int dropIndex = -1;

                for (int j = start; j < end; j++) {
                    if (nums[j] > nums[j + 1]) {
                        drops++;
                        dropIndex = j;
                    }
                }

                if (drops > 1) {
                    valid = false;
                    break;
                }

                int first;
                int last;

                if (drops == 1) {
                    first = nums[dropIndex + 1];
                    last = nums[dropIndex];

                    if (nums[end] > nums[start]) {
                        valid = false;
                        break;
                    }
                } else {
                    first = nums[start];
                    last = nums[end];
                }

                if (previousLast > first) {
                    valid = false;
                    break;
                }

                previousLast = last;
            }

            if (valid) {
                answer += k;
            }
        }

        return answer;
    }
}