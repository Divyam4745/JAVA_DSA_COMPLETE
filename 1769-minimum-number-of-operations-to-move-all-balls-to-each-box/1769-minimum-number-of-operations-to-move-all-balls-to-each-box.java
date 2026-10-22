
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int balls = 0;
        int moves = 0;

        // Calculate the answer for box 0
        for (int i = 0; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                balls++;
                moves += i;
            }
        }

        answer[0] = moves;

        int leftBalls = 0;
        int rightBalls = balls;

        for (int i = 0; i < n - 1; i++) {
            if (boxes.charAt(i) == '1') {
                leftBalls++;
            }

            rightBalls = balls - leftBalls;

            moves += leftBalls - rightBalls;
            answer[i + 1] = moves;
        }

        return answer;
    }
}
