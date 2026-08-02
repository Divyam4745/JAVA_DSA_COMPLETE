package Binary_Search_Practice;

public class Binary_serach {

    static int binarySearch(int arr[],int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;

        while (start<=end){
            //compare target with width
            if(target==arr[mid]){
                //target find
                return mid;
            }else if (target>=arr[mid]){
                //goto right side
                start=mid+1;
            }else if (target<=arr[mid]){
                //goto left side
                end=mid-1;
            }
            //update mid
            mid=(start+end)/2;
        }
        //agar koi nahi mila to return -1 kr do
        return -1;
    }
    static void main(String[] args) {
        int arr[]={2,3,6,8,9,10,23,56,78,90};
         int value=binarySearch(arr,56);
            System.out.println(value);
    }
}
