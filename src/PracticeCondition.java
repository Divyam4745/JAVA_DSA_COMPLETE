import java.util.Scanner;

public class PracticeCondition {
    public static void main(String[] args) {
        //QUESTION 1
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter her age");
//        int age=sc.nextInt();
//        if (age>=18) System.out.println("She is eligible");
//        else System.out.println("She is not eligible");
//        QUESTION 2
        System.out.println("Enter math marks");
        int math=sc.nextInt();
        System.out.println("Enter Physics Mark");
        int Physics=sc.nextInt();
        System.out.println("Enter Chemistry Mark");
        int Chemistry=sc.nextInt();
        System.out.println("Enter Hindi Mark");
        int Hindi=sc.nextInt();
        System.out.println("Enter English Marks");
        int English=sc.nextInt();

        int avg=(math+Physics+Chemistry+Hindi+English)/5;
        System.out.println("The Percentage is "+avg+"%");

    }
}
