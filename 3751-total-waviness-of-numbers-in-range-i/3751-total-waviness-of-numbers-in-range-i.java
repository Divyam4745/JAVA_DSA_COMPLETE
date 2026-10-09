class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;

        for (int num = num1; num <= num2; num++) {
            total += getWaviness(num);
        }

        return total;
    }

    private int getWaviness(int num) {
        String s = String.valueOf(num);

        // Fewer than 3 digits → waviness is 0
        if (s.length() < 3) {
            return 0;
        }

        int count = 0;

        // Check every digit except first and last
        for (int i = 1; i < s.length() - 1; i++) {
            int prev = s.charAt(i - 1) - '0';
            int curr = s.charAt(i) - '0';
            int next = s.charAt(i + 1) - '0';

            // Peak
            if (curr > prev && curr > next) {
                count++;
            }

            // Valley
            else if (curr < prev && curr < next) {
                count++;
            }
        }

        return count;
    }
}