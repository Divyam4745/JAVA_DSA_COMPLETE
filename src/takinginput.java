import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the intfirst");
        int firstint1=sc.nextInt();
        System.out.println("Enter the seconsint");
        int secondint=sc.nextInt();
        int add=firstint1+secondint;
        System.out.println("The add of Two is" + add );

         boolean flag =sc.nextBoolean();
        System.out.println("Enter the value of flag");
    }
}
