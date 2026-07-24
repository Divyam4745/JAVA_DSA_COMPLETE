package LeetCode;

import java.util.HashMap;

public class Practice_10 {

    static int freq(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i : arr) {
            if (map.get(i) > 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 3, 4, 4};

        System.out.println(freq(arr));
    }
}