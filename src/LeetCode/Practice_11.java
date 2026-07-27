package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Practice_11 {

    static List<Integer> findDisappearedNumber(int arr[]) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;

        for (int index = 0; index < n; index++) {

            int value = Math.abs(arr[index]);
            int position = value - 1;

            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 4, 5, 3, 3};

        System.out.println(findDisappearedNumber(arr));
    }
}