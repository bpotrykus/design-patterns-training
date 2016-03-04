package pl.training.tictactoe;

import java.util.HashSet;
import java.util.Set;

public class TicTacToe {

    public static final int BOARD_SIZE = 9;

    private Set<Integer> takenFields = new HashSet<>();
    private boolean rowIsTaken;
    private boolean columnIsTaken;
    private boolean diagonalIsTaken;

    public int getAvailableFields() {
        return BOARD_SIZE - takenFields.size();
    }

    public boolean shouldGameEnds() {
        return hasFreeFields() || rowIsTaken || columnIsTaken || diagonalIsTaken;
    }

    private boolean hasFreeFields() {
        return getAvailableFields() == 0;
    }

    public void takeRow() {
        this.rowIsTaken = true;
    }

    public void takeColumn() {
        this.columnIsTaken = true;
    }

    public void takeDiagonal() {
        this.diagonalIsTaken = true;
    }

    public boolean takeField(int fieldNumber) {
        return takenFields.add(fieldNumber);
    }

}
