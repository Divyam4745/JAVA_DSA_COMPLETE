package Binary_Search_Practice;

import java.util.Arrays;

public class leetcode23_aggressive_cow {

    static boolean isValidAns(int[] arr, int minDistance, int k) {

        int cowCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[lastPosition] >= minDistance) {

                cowCount++;
                lastPosition = i;

                if (cowCount == k) {
                    return true;
                }
            }
        }

        return false;
    }

    static int aggressiveCow(int[] arr, int k) {

        int n = arr.length;

        // Important: sort the stalls
        Arrays.sort(arr);

        int s = 0;
        int e = arr[n - 1] - arr[0];

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAns(arr, mid, k)) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 8, 4, 9};

        int k = 3;

        int result = aggressiveCow(arr, k);

        System.out.println(result);
    }
}