package Binary_Search_Practice;

public class Leetcode21SqrtX {
    private static final double EPSILON = 1e-12;

    public int mySqrt(int x) {
        return floorSqrt(x);
    }

    public static int floorSqrt(int x) {
        validateNonNegative(x);

        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x / 2;
        int answer = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    public static double sqrt(double x) {
        validateNonNegative(x);

        if (x == 0 || x == 1) {
            return x;
        }

        double start = 0;
        double end = Math.max(1.0, x);

        while (end - start > EPSILON) {
            double mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                start = mid;
            } else {
                end = mid;
            }
        }

        return start + (end - start) / 2;
    }

    private static void validateNonNegative(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers");
        }
    }

    private static void validateNonNegative(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x) || x < 0) {
            throw new IllegalArgumentException("Square root is defined only for finite non-negative numbers");
        }
    }

    public static void main(String[] args) {
        int number = 56;

        System.out.println("Floor sqrt: " + floorSqrt(number));
        System.out.printf("Decimal sqrt: %.6f%n", sqrt(number));
    }
}
