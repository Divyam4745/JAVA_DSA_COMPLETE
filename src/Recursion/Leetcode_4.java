package Recursion;

public class Leetcode_4 {
    static int climbing(int n)  {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int ans = climbing(n-1) + climbing(n-2);
        return ans;
    }

    static void main(String[] args) {
        System.out.println(climbing(5));
    }
}


