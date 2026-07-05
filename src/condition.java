import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        //IF ELSE CASE
        int daily=10;
        if (daily>12)
            System.out.println("True");
        else System.out.println("false");
        //IF-ELSE-IF LADDER
        int accuracy=70;
        if (accuracy>=90) System.out.println("Your aim is perfect");
        else if (accuracy>=75) System.out.println("Your aim is moderate");
        else if (accuracy>=65) {
            System.out.println("your aim is poor");
        }
        else System.out.println("need improvement");
        //NESTED IF
        int age=12;
        char gender='M';
        if (gender=='M') {
            System.out.println("You are male");
            if (age > 18) {
                System.out.println("You are male and age>18");
            } else {
                System.out.println("you are male and age<=18");
            }
        }
        else {
            System.out.println("You are not a male");
            if (age >18){
                System.out.println("you are not male and age>18");
            }
            else {
                System.out.println("you are not male and age<=18");
            }
        }
        //TERNARY
//           int age =10;
//           int ans=(age>18)? 22:34;
//        System.out.println(ans);
        //SWITCH CASE
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for day");
        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
