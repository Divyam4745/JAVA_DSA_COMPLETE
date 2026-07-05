import java.util.Scanner;

public class TowDArray {
    public static void main(String[] args) {
        //INPUT IN 2D ARRAY
        int crr[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<crr.length;i++){
            for (int j=0;j<crr.length;j++){
                System.out.println("Value of row " + i + " and column= " + j );
                crr[i][j]=sc.nextInt();
            }
        }
        //for print
        for (int rowIndex=0;rowIndex< crr.length;rowIndex++){
            for (int colIndex=0;colIndex<crr[rowIndex].length;colIndex++){
                System.out.print(crr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }



//        //Declaration 2D array
//        int[][] arr;
//        //allocation
//        arr=new int[5][5];
//        //Initilization 2D array
//        int[][]brr={
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//                //JAGGED ARRAY
////                {2,3},
////                {3,4,5,6,7,8,10},
////                {3},
////                { 3,6,1}
//        };
//        //for Print of all element
//        int rowLenght =brr.length;
//        int colLenght= brr[0].length;
//        for (int rowIndex=0;rowIndex<=rowLenght-1;rowIndex++){
//            //HR EK ROW KE LIYE HMM COL LENGHT VLAUE FIND KRENGE
//            // JAGGED VALUE FIND KRNE KE LIYE
////            CURRENT ROW-> BRR[ROWINDESX]
////            int colLenght=brr[rowIndex].length;
//            for (int colIndex =0;colIndex<=colLenght-1;colIndex++){
//                System.out.print(brr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }

    }
}
