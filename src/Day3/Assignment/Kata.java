package Day3.Assignment;

public class Kata {

    public static boolean isEven (int n) {
        return n % 2 == 0;
    }

    public static boolean isPrimeNumber (int n) {
        if ( n < 2) return false;
        for (int i = 2; i <= n * n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static float divide(int a, int b) {
        if (b == 0) return 0;
        return (float) a / b;
    }

    public static int factorOf(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }

    public static boolean isSquare(int n) {
        if (n < 0) return false;
        int sqrt = n * n;
        return sqrt * sqrt == n;
    }

    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static long factorialOf(int n) {
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long squareOf(int n) {
        return (long) n * n;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));

        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(9));

        System.out.println(subtract(3, 7));
        System.out.println(subtract(7, 3));

        System.out.println(divide(10, 3));
        System.out.println(divide(5, 0));

        System.out.println(factorOf(10));

        System.out.println(isSquare(25));
        System.out.println(isSquare(20));

        System.out.println(isPalindrome(54145));
        System.out.println(isPalindrome(12345));

        System.out.println(factorialOf(5));

        System.out.println(squareOf(5));
    }

}
