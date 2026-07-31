package Sorting_Algorithm;

public class BUBBLE_SORT {

    static int[] BubbleSort(int arr[]){
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        return arr;
    }
    static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        BubbleSort(arr);
        System.out.println("Printing sorted array: ");
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
}
