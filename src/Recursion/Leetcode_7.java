package Recursion;

public class Leetcode_7 {
    static int solve(int arr[] ,int target,int s, int e){
        //rukna kb hai
        if (s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            //left
            return solve(arr, target, s, mid-1);
        }
         else if (arr[mid]<target){
             //right
            return solve(arr, target, mid+1, e);
        }
      return solve(arr, target, s, e);
    }
    static int binary(int arr[],int target){
        int s=0;
        int e=arr.length-1;
         int ans=solve(arr,target,s,e);
         return ans;
    }
    static void main(String[] args) {
        int arr[]={10,20,30,50,60,90,100};
        int target=100;
        System.out.println(binary(arr,target));

    }
}
