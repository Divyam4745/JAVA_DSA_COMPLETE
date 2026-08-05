package Binary_Search_Practice;

public class Leetcode23_Painter_partation {

    static boolean isPossible(int boards[], int painters, int maxTime) {

        int painterCount = 1;
        int time = 0;

        for (int i = 0; i < boards.length; i++) {

            if (time + boards[i] <= maxTime) {
                time += boards[i];
            } else {
                painterCount++;

                if (painterCount > painters || boards[i] > maxTime) {
                    return false;
                }

                time = boards[i];
            }
        }

        return true;
    }

    static int minTimeToPaint(int boards[], int painters) {

        if (boards.length == 0 || painters <= 0) {
            return -1;
        }

        int start = 0;
        int end = 0;

        for (int board : boards) {
            end += board;
            start = Math.max(start, board);
        }

        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(boards, painters, mid)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int boards[] = {10, 20, 30, 40};
        int painters = 2;

        int ans = minTimeToPaint(boards, painters);

        System.out.println(ans);
    }
}
