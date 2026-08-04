package Binary_Search_Practice;

public class Leetcode21SqrtX {
    static double sqrt(int x, int precision) {

        int s = 0;
        int e = x;
        int ans = 0;

        // Integer part using Binary Search
        while (s <= e) {

            int mid = s + (e - s) / 2;

            long square = (long) mid * mid;

            if (square == x)
                return mid;

            if (square < x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        // Decimal part
        double result = ans;
        double factor = 0.1;

        for (int i = 0; i < precision; i++) {

            while ((result + factor) * (result + factor) <= x) {
                result += factor;
            }

            factor /= 10;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(sqrt(56, 5));
    }
}