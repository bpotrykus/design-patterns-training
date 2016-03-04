package pl.training.tictactoe;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe = new TicTacToe();

    @Test
    public void shouldGameEndsWhenAllFieldsAreTaken() {
        for (int i = 0; i < TicTacToe.BOARD_SIZE; i++) {
            ticTacToe.takeField(i);
        }
        assertTrue(ticTacToe.shouldGameEnds());
    }

    @Test
    public void shouldGameEndsWhenRowIsTaken() {
         ticTacToe.takeRow();
        assertTrue(ticTacToe.shouldGameEnds());
    }

    @Test
    public void shouldGameEndsWhenColumnIsTaken() {
        ticTacToe.takeColumn();
        assertTrue(ticTacToe.shouldGameEnds());
    }

    @Test
    public void shouldGameEndsWhenDiagonalIsTaken() {
        ticTacToe.takeDiagonal();
        assertTrue(ticTacToe.shouldGameEnds());
    }

    @Test
    public void couldOnlyTakeFreeFields() {
        ticTacToe.takeField(1);
        assertFalse(ticTacToe.takeField(1));
    }

}
