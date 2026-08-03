package Binary_Search_Practice;

public class leetcode_18 {
    static int peakindexofmountaion(int arr[]){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int mid = s+(e-s)/2;
            if (arr[mid]<arr[mid+1]){
                //main ascending order part me hu
                //iska mtlb mai left part me hu
                //or muchhe pta hai ans right part me hai
                s=mid+1;
            }else {
                e=mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,70,60,50,44};
        int peakIndex = peakindexofmountaion(arr);
//        for(int p:arr){
            System.out.println("The maximum element is at index: " + peakIndex);
            System.out.println("The maximum element is: " + arr[peakIndex]);
//        }

    }
}
