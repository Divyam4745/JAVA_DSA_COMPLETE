package LeetCode;

public class Practice_16_rotate90degreeimage {

    static int[][] rotate(int arr[][], int N) {
        // step 1 transpose of matrix
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // step 2 reverse every row of matrix
        for (int row = 0; row < N; row++) {
            int startCol = 0;
            int endCol = N - 1;

            while (startCol < endCol) {
                int temp = arr[row][startCol];
                arr[row][startCol] = arr[row][endCol];
                arr[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }

        return arr;
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int N = arr.length;
        int[][] ans = rotate(arr, N);

        printMatrix(ans);
    }
}
