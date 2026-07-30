package LeetCode;

public class Practice_15_Imp {

    static int[][] transposematrix(int arr[][]) {

        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int[][] ans = new int[totalCols][totalRows];

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] result = transposematrix(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}