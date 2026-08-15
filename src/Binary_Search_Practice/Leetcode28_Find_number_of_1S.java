package Binary_Search_Practice;

public class Leetcode28_Find_number_of_1S {

    // Finds the index of the first 1 in a sorted row
    static int getFirstOccurance(int[][] arr, int rowIndex) {

        int totalCol = arr[0].length;

        // If last element is 0, there is no 1 in this row
        if (arr[rowIndex][totalCol - 1] == 0) {
            return totalCol;
        }

        int s = 0;
        int e = totalCol - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (arr[rowIndex][mid] == 0) {
                // First 1 must be on the right
                s = mid + 1;
            } else {
                // mid can itself be the first 1
                e = mid;
            }
        }

        return s;
    }

    // Returns the row index having maximum number of 1s
    static int rowWithMaximunmone(int[][] mat) {

        int totalRow = mat.length;
        int totalCol = mat[0].length;

        int maxi = -1;
        int maxonewaliindexrow = -1;

        for (int row = 0; row < totalRow; row++) {

            int firstOccurrenceIndex = getFirstOccurance(mat, row);

            // Number of 1s = total columns - index of first 1
            int oneCount = totalCol - firstOccurrenceIndex;

            if (oneCount > maxi) {

                maxi = oneCount;
                maxonewaliindexrow = row;
            }
        }

        return maxonewaliindexrow;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 0, 0, 1, 1},
                {0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1}
        };

        int result = rowWithMaximunmone(arr);

        System.out.println("Row with maximum number of 1s: " + result);
    }
}