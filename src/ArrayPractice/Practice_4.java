package ArrayPractice;

public class Practice_4 {
    public static void main(String[] args) {
        int arr[]={-2,-5,7,3,-9,1};
        int pos=0;
        int neg=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
               pos=pos+arr[i];
            }else {
              neg=neg+arr[i];
            }
        }
        System.out.println( "Positive sum of array: "+ pos);
        System.out.println("Negative sum of array: " + neg);

    }
}
