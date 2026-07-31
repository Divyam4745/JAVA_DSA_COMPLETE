package Sorting_Algorithm;

public class SELECTION_SORT {

    static int[] selection(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            int smallestINdex=i;
            for (int j=i+1;j<n;j++){

                if (arr[j]<arr[smallestINdex]){
                    smallestINdex=j;
                }
            }
                    int temp=arr[i];
                    arr[i]=arr[smallestINdex];
                    arr[smallestINdex]=temp;
        }
        return arr;
    }
    static void main(String[] args) {
        int arr[]={6,7,3,4,9,8,5,10,1};
        selection(arr);
        for (int p:arr){
            System.out.print(p+" ");
        }

    }
}
