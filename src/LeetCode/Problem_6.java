package LeetCode;

import java.util.HashMap;

public class Problem_6 {
    public int finffirstReceptation(int[]arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        //freq store
        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {

    }
}
