package chessmen;


import board.Colors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    @Test
    public void shouldReportInvalidMove_whenNullIsPassedForVerifyingMove()
    {
        Pawn pawn = new Pawn(Colors.WHITE,null);
        boolean expectedMoveIsValid = false;

        boolean moveIsValid = pawn.canMove(null);

        assertEquals(expectedMoveIsValid, moveIsValid );
    }

}