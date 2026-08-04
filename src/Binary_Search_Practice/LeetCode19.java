package Binary_Search_Practice;

public class LeetCode19 {

    static  int pivoteelement(int  arr[])
    {
        int n= arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        if (arr[s]<arr[e]){
            return  -1;
        }
        while (s<=e){
                int mid=s+(e-s)/2;
            if (arr[mid]<=arr[n-1]){
                e=mid-1;
            }
            else {
                //arr[mid]>arr[n-1]
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
int arr[]={10,20,30,70,0,1,2,3};
int pixal=pivoteelement(arr);
        System.out.println("Pivote element is :" + pixal);
    }
}
