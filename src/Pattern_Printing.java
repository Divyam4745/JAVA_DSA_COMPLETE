public class Pattern_Printing {
    public static void main(String[] args) {
        //SOLID STATE
//        for (int i=1;i<=4;i++){
//            for (int j=1;j<=4;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //SOLID RECTANGULAR
//        for (int i=1;i<=3;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //SOLID SQUARE
//        for (int i =1;i<=4;i++){
//            for (int j=1;j<=4;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //SOLID ALPHABATIC
//        for (int i=1;i<=4;i++) {
//            for (int j=1;j<=4;j++){
//                System.out.print((char) (j+64)+" ");
//            }
//            System.out.println();
//        }
        //SOLID NUMBER
//        for (int i =1;i<=4;i++){
//            for (int j=1;j<=4;j++){
//                System.out.print(i +  " ");
//            }
//            System.out.println();
//        }
        //SOLID SMALL AND CAPITAL ALPHABET
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                if (i % 2 == 1) {
//                    System.out.print((char) (i + 96));
//                } else {
//                    System.out.print((char) (i + 64));
//                }
//            }
//            System.out.println();
//        }

        //TRIANGLE PATTERN RIGHT ANGLE TRIANGLE
//        int n=5;
//        for (int row=1;row<=n;row++){
//            for (int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //TRIANGLE PATTERN
//        int n=5;
//        for (int row=1;row<=n;row++){
//            for (int col=1;col<=row;col++){
//                System.out.print(col);
//            }
//            System.out.println();
//        }
//        //TRIANGLE ALPHABET
//        int n=5;
//        for (int row=1;row<=n;row++){
//            for (int col=1;col<=row;col++){
//                System.out.print((char) (row+64));
//            }
//            System.out.println();
//        }
          //TRIANGLE DIFFERENT
//         int n=5;
//        for (int row=1;row<=n;row++){
//            for (int col=1;col<=row;col++){
//                if (row%2==1){
//                    System.out.print(col);
//                }else {
//                    System.out.print((char) (col+64));
//                }
//
//            }
//            System.out.println();
//        }
        //ROHMBUS
//        int n=5;
//        for (int row=1;row<=n;row++){
//            for (int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            for (int col=1;col<=n;col++){
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
        //Inverted right angle triangle
//        int n =5;
//
//        for (int row=1; row<=n;row++){
//            for (int col=1;col<=n+1-row;col++){
//                System.out.print("*");
////                System.out.print((char)(col+64)+" ");
//            }
//            System.out.println();
//        }
        //SOLID PRYMID
//        int n=5;
//        for (int row=1;row<=n;row++) {
//            //space
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            //Stars
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //OPPOSITE PRYMID
//        int n=5;
//        for (int row=1;row<=n;row++){
//            //Space
//            for (int col=1;col<=row-1;col++){
//                System.out.print("  ");
//            }
//            for (int col=1;col<=2*n-2*row+1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //HOLLOW RECTENGLE
//        int n=4;
//        for(int row=1;row<=n;row++){
//            for (int col=1;col<=6;col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//                    if (col == 1) {
//                        System.out.print("* ");
//                    } else if (col == 6) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//
//        }

        //TRIANGLE RIGHT ANGLE
//        int n=10;
//        for (int row=1;row<=n;row++){
//            if (row==1||row==2||row==n){
//                for (int col=1;col<=row;col++){
//                    System.out.print("* ");
//                }
//            }else {
//                System.out.print("* ");
//                for (int col=1;col<=(row-2);col++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //HOLLOW PRYMID






    }
}