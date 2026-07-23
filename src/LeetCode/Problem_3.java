package LeetCode;

public class Problem_3 {
    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    static void main(String[] args) {
        int arr[] = {2, 5, 7, 5, 7, 8, 5};
        int[] result = twoSum(arr, 10);

        if (result.length == 2) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
