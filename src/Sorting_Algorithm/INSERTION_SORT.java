package Sorting_Algorithm;

public class INSERTION_SORT {

    static int[] insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    static void main(String[] args) {
        int arr[] = {6, 7, 3, 4, 9, 8, 5, 10, 1};
        insertion(arr);
        for (int p : arr) {
            System.out.print(p + " ");
        }
    }
}
