public class TaskFive {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if ( i % 4 == 0 ) {
				for (int j = 1; j <= 5; j++) {
					System.out.printf("%d ", i);
				}
			}
			i++;
		}
	}
}
