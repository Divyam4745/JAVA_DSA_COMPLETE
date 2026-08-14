package Binary_Search_Practice;

public class Leetcode27 {
    static boolean searchMatrix(int [][] arr,int target){
        int totalRow=arr.length;
        int totalCol=arr[0].length;
         int n=totalCol* totalRow;
         //1D array
        int s=0;
        int e=n-1;

        //Binary search
        while(s<=e){
            int mid=s+(e-s)/2;
            int rowIndex= mid/totalCol;
            int colIndex= mid%totalCol;

            if(arr[rowIndex][colIndex] == target){
                return true;
            }
            else if (arr[rowIndex][colIndex] > target){
                //Left
                e=mid-1;
            }else {
                //Right
                s=mid+1;
            }
        }
        return false;
    }
    static void main(String[] args) {
         int arr[][]={{1,3,5,7},
                 {10,11,16,20},
                 {23,30,34,60}};
         int target= 16;
        System.out.println(searchMatrix(arr,16));


    }
}
