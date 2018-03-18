package chessmen;

import board.Move;

public interface Chessman {

    boolean canMove(Move move);
    boolean doMove(Move move);
    boolean getColor();

}
