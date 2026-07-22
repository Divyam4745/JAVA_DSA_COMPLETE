package LeetCode;

public class Problem_2 {
    static int missingNumber(int arr[]) {
        int xorSum = 0;
        // XOR all array elements
        for (int num : arr) {
            xorSum ^= num;
        }
        int n = arr.length;
        // XOR numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xorSum ^= i;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int arr[] = {3, 0, 1};
        System.out.println("Missing Number = " + missingNumber(arr));
    }
}
