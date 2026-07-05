public class Practice_array {
    public static void main(String[] args) {
        //  Question 1  aary ke andar sare element print kro
//        int arr[]={4,7,2,5};
        //Method 1
//        for (int val:arr){
//            System.out.print(val);
//        }
        //Method 2
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //Question 2 sum print kro
//        int sum=0;
//        for (int i=0;i< arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);

        //Question 3 Multiple print kro
//        int mul=1;
//        for (int i=0;i<arr.length;i++){
//            mul=mul*arr[i];
//        }
//        System.out.print(mul);

        //Question print maximum element of array
//        int arr[]={3,-5,6,21,6,-10};
//        int maxvalue=arr[0];
//
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>maxvalue){
//               maxvalue= arr[i];
//            }
//        }
//        System.out.println(maxvalue);

        //Question 4 find the minimum value inside the arry
        int arr[]={3,6,-1,-9,56,3,-2};
        int minValue=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<minValue){
                minValue=arr[i];
            }
        }
        System.out.println(minValue);


    }
}
