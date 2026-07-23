package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem_4 {

    static List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> output = new ArrayList<>();
        int n = arr.length;
        int target = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        output.add(temp);
                    }
                }
            }
        }

        return output;
    }
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(arr);

        System.out.println(ans);
    }
}