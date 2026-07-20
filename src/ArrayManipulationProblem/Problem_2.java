package ArrayManipulationProblem;

public class Problem_2 {
    static void shiftArray(int arr[]){
        int n= arr.length;
        int temp=arr[n-1];
        for (int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        shiftArray(arr);
        for (int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
