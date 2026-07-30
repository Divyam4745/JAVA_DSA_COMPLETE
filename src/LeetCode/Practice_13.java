package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Practice_13 {
    static List<Integer> practic(int arr[][]) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr.length; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }
        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            List<Integer> ans = practic(arr);

            System.out.println(ans);
    }
}
