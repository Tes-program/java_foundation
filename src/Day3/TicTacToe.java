package Day3;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{'X', 'O', 'X'}, {'X', 'X', 'O'}, {'O', 'X', 'X'}};
        for (char[] row : board) {
            for (char c : row) {
                if (c == 'X') System.out.printf("%d ", 1);
                else System.out.printf("%d ", 0);
            }
            System.out.println();
        }
    }
}
