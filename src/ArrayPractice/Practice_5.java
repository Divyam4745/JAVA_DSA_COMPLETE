package ArrayPractice;

public class Practice_5 {
    static void main(String[] args) {
        int arr[]={0,1,1,0,1,0,1,1};
        int oneCount=0;
        int zeroCount=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                zeroCount++;
            }else {
                //oneCount bdega
                oneCount++;
            }
        }
        System.out.println("Number of Zero: "+ zeroCount);
        System.out.println("NUmber of One: "+ oneCount);


    }
}
