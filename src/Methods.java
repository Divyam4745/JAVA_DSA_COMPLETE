import java.lang.reflect.Type;

public class Methods {
    //declaration method
//       static void printtowkatable(){
//            for (int i=1;i<=10;i++){
//                int ans=2*i;
//                System.out.println(ans);
//            }
//        }
    //WITH PARAMETER
//     static void towsum(int x,int y){
//        int sum=x+y;
//        System.out.print("Sum: "+sum);
//    }
//    VOID RETURN Type

    static void kia(int a,int b){
        int ans=a+b;
        System.out.println(ans);
        return;
    }

        //call methods
    public static void main(String[] args) {
//        printtowkatable();
//        towsum(5,10);
        kia(5 ,6);
    }

    }
