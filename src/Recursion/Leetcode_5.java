package Recursion;

public class Leetcode_5 {

    static void printmyname(int n){
        if (n==0){
            return ;
        }
        //processing
        System.out.println("Babbar");
        //R.R
        printmyname(n-1);
    }
    static void main() {
        printmyname(10);
    }
}
