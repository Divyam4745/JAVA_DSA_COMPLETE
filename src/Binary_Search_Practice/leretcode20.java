package Binary_Search_Practice;

public class leretcode20 {

    static int pivotelement(int arr[]) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (n == 0 || arr[s] <= arr[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

    static int binarySearch(int arr[], int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    static int searchInRotatedArray(int arr[], int target) {
        int n = arr.length;
        int pivot = pivotelement(arr);

        if (n == 0) {
            return -1;
        }

        if (pivot == -1) {
            return binarySearch(arr, 0, n - 1, target);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, 0, pivot - 1, target);
        }

        return binarySearch(arr, pivot + 1, n - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 70, 0, 1, 2, 3};
        int target = 1;

        int index = searchInRotatedArray(arr, target);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
