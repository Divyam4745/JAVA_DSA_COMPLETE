package Recursion;

public class Leetcode_1 {
    static long factroial(int n){
        //base case
    if (n==0){
        return 1;
    }
    long ans = n* factroial(n-1);
    return  ans;
    }
    static void main() {
        int n=5;
        System.out.println("The factroical is : " + factroial(n));

    }
}
