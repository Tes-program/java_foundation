package Week4.Day1;

public class Divisor {
    public static int divisor (int num, int divisor) {
        if (divisor < 2) throw new IllegalArgumentException("Divisor must be greater than 1");
        if (num == 0) return 0;

        int quotient = 0;
        int count = 0;

        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                if (count == divisor) {
                    quotient++;
                    count = 0;
                }
                count++;
            }
        } else {
            for (int i = 0; i >= num; i--) {
                if (count == divisor) {
                    quotient--;
                    count = 0;
                }
                count--;
            }
        }
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(divisor(10, 3));
    }
}
