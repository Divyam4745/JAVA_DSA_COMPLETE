package Binary_Search_Practice;

public class Leetcode17 {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
