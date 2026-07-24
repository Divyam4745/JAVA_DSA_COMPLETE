package LeetCode;

public class Practice_9 {

    static int removeDuplicate(int arr[]) {

        int i = 0;
        int j = 1;

        while (j < arr.length) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }

            j++;
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2,3,5,5,7,3,5,10,9,9, 3, 3, 4};

        int n = removeDuplicate(arr);

        System.out.println("Length = " + n);

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}