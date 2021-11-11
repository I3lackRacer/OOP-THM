package main.VW5.TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.VW5.TicTacToe.TicTacToe.*;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    int[] field = new int[]{
            1, 0, 0,
            0, -1, 0,
            0, 0, 1
    };

    @Test
    void TestIsValid() {
        assert isValid(field);
        assert !isValid(new int[2]);
        assert !isValid(new int[]{23});
        assert !isValid(new int[]{-23});
        assert !isValid(new int[0]);
        assert !isValid(new int[1345]);
        assert isValid(new int[9]);
        assert !isValid(null);
    }

    @Test
    void TestPrintBoard() {
        printBoard(field);
    }

    @Test
    void TestBoard2Board() {
        Assertions.assertEquals(board2Board(field, new char[]{'x', '.', 'o'}), "+-----+\n|o|.|.|\n|.|x|.|\n|.|.|o|\n+-----+\n");
        Assertions.assertEquals(board2Board(field, new char[]{'X', '.', 'o'}), "+-----+\n|o|.|.|\n|.|X|.|\n|.|.|o|\n+-----+\n");
    }
}