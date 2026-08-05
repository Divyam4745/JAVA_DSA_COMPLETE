package Binary_Search_Practice;

public class LeetCode22_BookAllocationProblem {

    static boolean isValidAns(int arr[], int k, int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {

                studentCount++;

                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    static int printPages(int arr[], int k) {

        int sum = 0;
        int s = 0;

        for (int x : arr) {
            sum += x;
            s = Math.max(s, x);
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 50};

        int p = printPages(arr, 5);

        System.out.println(p);
    }
}