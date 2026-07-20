package ArrayPractice;

public class Practice_6 {
    public static void main(String[] args) {
        int arr[] = {7, 9, 10, 12, 1, 3, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Minimum element: " + arr[i + 1]);
                break;
            }
        }
    }
}
