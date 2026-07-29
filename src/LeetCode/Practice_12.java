package LeetCode;

public class Practice_12 {

    static int maximumsum(int arr[]){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        int n= arr.length;
        for (int i=0;i<n;i++){
            //sum update krte hai
            sum=sum+arr[i];
            //maxi ki value update krte hai
            maxi=Math.max(maxi,sum);
            //sum check krte hai for negative value
            if (sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumsum(arr));

    }

}


