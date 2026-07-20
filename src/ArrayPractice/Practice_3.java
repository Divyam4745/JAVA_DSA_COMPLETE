package ArrayPractice;

public class Practice_3 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,9,10};
        int target = 9;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
