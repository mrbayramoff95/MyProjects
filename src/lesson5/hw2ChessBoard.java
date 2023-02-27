package lesson5;

public class hw2ChessBoard {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < board.length - 1; j++) {
                if ((i + j) % 2 == 0)
                    board[i][j] = "W";
                else
                    board[i][j] = "B";
                System.out.println(" " + board[i][j]);
            }
        }
    }
}