package Day2.FireDrill1;

public class TaskSix {
        public static void main(String[] args) {
                int i = 1;
                while (i <= 10) {
                        if ( i % 4 == 0 ) {
				int multipleValue = i;
                                for (int j = 1; j <= 5; j++) { 
                                        System.out.printf("%d ", multipleValue);
					multipleValue = multipleValue * i;
                                }
                        }
                        i++;
                }
        }
}
