package Day2.FireDrill1;

public class TaskNine {
    public static void main(String[] args) {
        int multipleValue4 = 4;
        int multipleValue8 = 8;
        int sum4 = 0;
        int sum8 = 0;

        for (int j = 1; j <= 5; j++) {
            sum4 += multipleValue4;
            sum8 += multipleValue8;
            multipleValue4 = multipleValue4 * 4;
            multipleValue8 = multipleValue8 * 8;
        }

        int totalSum = sum4 + sum8;

        int squareTotalSum = totalSum * totalSum;

        System.out.printf("%d ", squareTotalSum);
    }
}
