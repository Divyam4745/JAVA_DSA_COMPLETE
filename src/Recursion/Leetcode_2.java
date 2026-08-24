package Recursion;

public class Leetcode_2 {
    static int powerofTwo(int n)    {
        if (n==0){
            return 1;
        }

        int ans= 2* powerofTwo(n-1);
        return ans;
    }

    static void main() {
        int n= 6;
        System.out.println(powerofTwo(n));
    }
}
