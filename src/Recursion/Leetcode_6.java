package Recursion;

public class Leetcode_6 {
    static void printnumber(int n){
         int count=1;
        while (count<=n) {
            System.out.println(count);
            count++;
//            printnumber(n);
        }
    }
    static void main() {
        printnumber(10);
    }
}
