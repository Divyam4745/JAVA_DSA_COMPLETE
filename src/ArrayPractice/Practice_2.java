package ArrayPractice;

public class Practice_2 {
    public static void main(String[] args) {
        int arr[] = {2,4,9,11,45,67};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
