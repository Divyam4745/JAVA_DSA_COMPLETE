import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Stringbasic {
    public static void main(String[] args) {

        String FirstName="Divyam";
        String LastName=new String("Vishwakarma");
        System.out.println(FirstName +" " + LastName);
        System.out.println(FirstName.length());
        System.out.println(FirstName.charAt(0));

        //String is Immutable
//        String name="divyam";
//        name="dkldgj";
//        System.out.println(name);

        //Input in String
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the Value of String: ");
//        String name=sc.nextLine();
//        System.out.println("Value: "  + name);


        //Inbuild Function
//        String  name="divyam";
//        String str="DIVYAM";
//        System.out.println(name.length());
//        System.out.println(name.charAt(1));
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.equals(str));
//        System.out.println(name.equalsIgnoreCase(str));
//        System.out.println(name.isBlank());
//        System.out.println(name.isEmpty());

        //------Trim------
//        String str1="My,name,is,Lakhan";
//        String[] Pooki= str1.split(",");
//        for (String str:Pooki){
//            System.out.println(str);

            //----Replace------
            String n1="TITLE";
            String n2= n1.replace("T","F");
            System.out.println(n2);
    }
}
