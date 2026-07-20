package ArrayPractice;

public class Practice_1 {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int size = arr.length;
        double avg = (double) sum / size;

        System.out.println("Average = " + avg);
    }
}
