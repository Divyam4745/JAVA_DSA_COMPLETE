package LeetCode;

public class Problem_1 {

    static  void shortArray(int arr[]){
        int n= arr.length;
//        int i=0;
        int j=n-1;
        for (int i=0;i<n;i++){
            while (i<j){
                if (arr[i]==1&&arr[j]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if (arr[i]==0){
                    i++;
                }if (arr[j]==1){
                    //j ko decrement kro
                    j--;
                }
            }
        }
    }
    static void main(String[] args) {
        int arr[]={0,1,1,0,1,0,1};
        shortArray(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
