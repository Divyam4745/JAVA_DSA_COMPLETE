public class Loop_in_java {
    public static void main(String[] args) {
        //For Loop
//        for (int i = 1; i <= 10; i+=2)
//            System.out.println(i);
//            System.out.println("Divyam");

        //Nested loop
//        for (int i = 1; i <= 3; i++) {  //Rows
//            for (int j = 1; j <= 3; j++) {  //Column
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

       // Break
//        for (int i=1;i<=10;i++){
//            if (i==5){                  //break from iteration
//                break;
//            }
//            System.out.println("* ");
//        }
        //Continue
//        for (int i=1;i<=10;i++){
//            if (i==5||i==2||i==8){               //Skip the iteration
//                continue;
//            }
//            System.out.println(i);
//        }

        //while loop
//        int i=1;       //initilation
//        while (i<=5){                    // Condition
//            System.out.println(i);
//            i++;                  //Update
//        }
        //Do While Loop
        int i=1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);
    }
}