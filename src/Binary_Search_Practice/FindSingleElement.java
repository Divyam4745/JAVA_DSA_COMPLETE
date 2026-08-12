package Binary_Search_Practice;

public class FindSingleElement {

    public static int findSingleElement(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            // Ensure mid is even so we always check pairs starting at an even index
            if (mid % 2 != 0) {
                mid--;
            }

            // If the pair matches, the single element is further to the right
            if (arr[mid] == arr[mid + 1]) {
                s = mid + 2;
            } else {
                // Disruption detected, single element is on the left or at mid
                e = mid;
            }
        }

        // 's' will point to the single element
        return arr[s];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 6, 6,8,7, 7};

        int unmatched = findSingleElement(arr);
        System.out.println("The unmatched element is: " + unmatched);
    }
}