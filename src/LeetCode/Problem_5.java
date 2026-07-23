package LeetCode;

import java.util.Arrays;

public class Problem_5 {

    static int twoPointer(int arr[]) {
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 5, 5, 5, 6, 7, 9};

        int uniqueLength = twoPointer(arr);

        System.out.println("Unique elements:");
        for (int k = 0; k < uniqueLength; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\n\nFull array:");
        System.out.println(Arrays.toString(arr));
    }
}