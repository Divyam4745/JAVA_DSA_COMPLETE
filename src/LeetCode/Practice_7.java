package LeetCode;

public class Practice_7 {
    static int[] twosum(int arr[],int target){
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    int ans[]={i,j};
                    return ans;
                }
            }
        }
        int ans[]={};
        return ans;
    }
    static void main(String[] args) {
        int arr[]={2,7,5,8,5,4,9,0};
        int ans[]=twosum(arr,10);
        for (int i:ans){
        System.out.print(i+" ");

        }
    }
}
