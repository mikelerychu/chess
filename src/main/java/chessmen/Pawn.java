package chessmen;

import board.ChessPosition;
import board.Colors;
import board.Move;

public class Pawn implements Chessman {

    public Pawn(Colors colors, ChessPosition chessPosition) {

    }

    @Override
    public boolean canMove(Move move) {
        return false;
    }

    @Override
    public boolean doMove(Move move) {
        return false;
    }

    @Override
    public boolean getColor() {
        return false;
    }
}
