package board;

import chessmen.Pawn;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    @Test
    public void shouldWhitePlayerContainEightPawnsOnRightPositions_whenGameStarts()
    {
        Board board = new Board();
        Set<Pawn> pawns = board.getWhitePawns();
        assertEquals(8,pawns.size());


    }

    private Set<Pawn> prepareEightPawnsOnInitialGamePositions()
    {
        Set<Pawn> pawns = new HashSet<>();
        for(int i = 0 ; i < 8 ; i++)
        {
            pawns.add(new Pawn(Colors.WHITE,new ChessPosition(i,2)));
        }
        return pawns;
    }

}