package ArrayManipulationProblem;
public class Problem_1 {

    static void reversearray(int arr[]) {
        int i = 0;
        int n = arr.length;
        int j = n - 1;
        while (i < j) {
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            //i ko aage lo
            i++;
            // j ko pichhe lo
            j--;
        }
            for (int k : arr) {
                System.out.println(k);
            }
    }
        static void main(){
            int arr[]={1,2,3,4,5};
                    reversearray(arr);
    }

}
