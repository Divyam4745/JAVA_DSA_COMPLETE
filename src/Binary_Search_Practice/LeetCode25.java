package Binary_Search_Practice;

public class LeetCode25 {
    static int Almostsorarray(int[] arr, int k) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Check mid
            if (arr[mid] == k) {
                return mid;
            }
            // Check left neighbour if within bounds
            if (mid - 1 >= s && arr[mid - 1] == k) {
                return mid - 1;
            }
            // Check right neighbour if within bounds
            if (mid + 1 <= e && arr[mid + 1] == k) {
                return mid + 1;
            }

            // Decide direction (skip mid-1/mid+1 since they were already checked)
            if (k > arr[mid]) {
                s = mid + 2; // Move right
            } else {
                e = mid - 2; // Move left
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;

        int result = Almostsorarray(arr, target);
        System.out.println("Element " + target + " found at index: " + result);
    }
}
