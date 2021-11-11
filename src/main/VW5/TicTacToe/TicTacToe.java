package main.VW5.TicTacToe;

public class TicTacToe {

    int[] field = new int[9];

    static boolean isValid(int[] board) {
        if (board == null) {
            return false;
        }

        for (int cell: board) {
            if ( cell < -2 || cell > 2) {
                return false;
            }
        }

        return board.length == 9;
    }

    static void printBoard(int[] board) {
        System.out.println(board2Board(board, new char[] {'X', '.', 'O'}));
    }

    static String board2Board(int[] board, char[] symbol) {
        if (symbol == null || symbol.length != 3 || !isValid(board)) {
            return "";
        }

        StringBuilder output = new StringBuilder();
        output.append("+-----+\n");
        for (int i = 0; i <= 2; i++) {
            output.append("|");
            output.append(symbol[board[i * 3] + 1]);
            output.append("|");
            output.append(symbol[board[i * 3 + 1] + 1]);
            output.append("|");
            output.append(symbol[board[i * 3 + 2] + 1]);
            output.append("|\n");
        }
        output.append("+-----+\n");

        return output.toString();
    }
}
