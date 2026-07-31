package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Practice_17_Spiral_Matrix {

    static List<Integer> spiral(int arr[][]) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            //ROW WISE LEFT TO RIGHT
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(arr[startingRow][col]);
            }
            //COL WISE TOP TO BOTTOM
            for (int row = startingRow + 1; row <= endingRow; row++) {
                result.add(arr[row][endingCol]);
            }

            if (startingRow < endingRow) {
                //ROW WISE RIGHT TO LEFT
                for (int col = endingCol - 1; col >= startingCol; col--) {
                    result.add(arr[endingRow][col]);
                }
            }

            if (startingCol < endingCol) {
                //COL WISE BOTTOM TO TOP
                for (int row = endingRow - 1; row > startingRow; row--) {
                    result.add(arr[row][startingCol]);
                }
            }
            startingRow++;
            endingRow--;
            startingCol++;
            endingCol--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> ans = spiral(arr);
        System.out.println(ans);
    }
}
