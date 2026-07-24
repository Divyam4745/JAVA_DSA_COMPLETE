package LeetCode;

public class Practice_8 {
    static int [] tripletsum(int arr[],int target){
        int n= arr.length;
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=i+2;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        int ans[] = {i, j, k};
                        return ans;
                    }
                }
            }
        }
        int ans[]={};
        return ans;
    }
    static void main(String[] args) {
        int arr[]={2,5,8,2,9,8,5,10};
        int ans[]=tripletsum(arr,19);
        for (int p:ans){
            System.out.print(p+" ");
        }

    }
}
