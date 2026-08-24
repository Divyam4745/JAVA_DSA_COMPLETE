package Recursion;

public class Leetcode_3 {
    static int fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int ans=fib(n-1) + fib(n-2);
        return  ans;
    }
    static void main() {
        System.out.println(fib(4));

    }
}
