package Binary_Search_Practice;

public class LeetCode30_ {

    static int unboundedArray(int arr[], int target) {

        // If first element is target
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;

        // Find a range where target can exist
        while (i < arr.length && arr[i] < target) {
            i = i * 2;
        }

        // If i goes outside the array
        if (i >= arr.length) {
            i = arr.length - 1;
        }

        int s = i / 2;
        int e = i;

        // Normal Binary Search
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100, 110
        };

        int result = unboundedArray(arr, 90);

        System.out.println("The targeted element is : " + result);
    }
}