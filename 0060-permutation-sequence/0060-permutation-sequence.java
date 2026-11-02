class Solution {
    public String getPermutation(int n, int k) {
        int[] fact = new int[n + 1];
        int[] nums = new int[n];

        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
            nums[i - 1] = i;
        }

        k--;

        StringBuilder ans = new StringBuilder();

        for (int i = n; i > 0; i--) {
            int index = k / fact[i - 1];

            ans.append(nums[index]);

            // Remove the selected number by shifting
            for (int j = index; j < i - 1; j++) {
                nums[j] = nums[j + 1];
            }

            k %= fact[i - 1];
        }

        return ans.toString();
    }
}