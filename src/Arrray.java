import java.util.Scanner;

public class Arrray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[5];
        //declaration
//        int arr[];
        //allocation
//        arr=new int[6];
        //initilization
//        int brr[]={6,4,8};
//        int arr[]={6,19,69,89,6};

        //value access
//        System.out.println("value at 0 index " + arr[0]);
//        System.out.println("value at 1 index " + arr[1]);
//        System.out.println("value at 2 index " + arr[2]);
//        System.out.println("value at 3 index " + arr[3]);

        //value access
//        for (int i=0;i<=arr.length;i++){
//            System.out.println((arr[i]));
//        }
        //another value
//        for (int val:arr){
//            System.out.println(val);
//        }

        // Input in Array
        for (int i=0;i<=marks.length;i++){
            System.out.println("Provide index for input : " + i);
            marks[i]=sc.nextInt();
        }

        //output
        System.out.println("Your array value is: ");
        for (int val:marks){
            System.out.println(val);
        }


    }
}
