public class BasicMath {

    //Question 1
//    static void printdigit(int num ){
    //agar mere num ki value ==0 ruko
    //agar mere num ki value !=0 processing krte rho
//        while (num != 0){
//            int digit=num%10;
//            System.out.println(digit);
//            //last digit remove
//            num=num/10;
//        }
//    }

//    Question 2
//    static int Countdigits(int num){
//    int count=0;
//    while (num!=0){
//        int digit=num%10;
//        count++;
//        num=num/10;
//    }
//    return count;
//    }
//}

    //Question 3
//    static int sumdigit(int num){
//        int sum=0;
//        while (num!=0){
//        int digit=num%10;
//         sum=sum+digit;

    /// /            System.out.println(sum);
//            num=num/10;
//        }
//        return sum;
//    }


    //Question 4
static int reverseNum(int num){
    int revNum=0;
    while (num!=0){
        int digit=num%10;
        revNum=revNum*10+digit;
        num=num/10;
    }
    return revNum;
}

    //Question 5 Palindrome number
    static boolean palindrome(int num) {
        int originalnumber = num;
        int reversnumber = reverseNum(num);
        if (originalnumber == reversnumber) {
            System.out.println("it is a Plaindrome");
            return true;
        } else {
            System.out.println("It is no Plaindrome");
            return false;
        }
    }

    public static void main(String[] args) {

//Question 1
//        int num = 535636;
//         printdigit( num )

//Question 2
//        int result = BasicMath.Countdigits(num);
//        System.out.println("Number of digits: " + result);
//Question 3
//        int num=36472;
//        int sum=sumdigit(num);
//        System.out.println(sum);

//Question 4 Reverse a number
//        int num=543897;
//        int Result=reverseNum(num);
//        System.out.println("The Reverse Number is: " + Result);

//        /Question 5 Plaindrome number
boolean ans=palindrome(1221);
        System.out.println(ans);
    }
}