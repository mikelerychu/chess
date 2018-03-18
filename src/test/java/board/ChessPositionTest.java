package board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ChessPositionTest {

    @DisplayName("Should raise exception when rank position of chessman on the board is out of bounds")
    @ParameterizedTest(name = "[{index}]: Rank position=''{0}''")
    @ValueSource(ints = {0, 9})
    public void shouldRaiseException_whenBoardRankPositionIsOutOfBounds(int boardRankPosition) {
        int validBoardFilePosition = 1;
        assertThrows(IllegalArgumentException.class, () -> new ChessPosition(boardRankPosition, validBoardFilePosition));
    }


    @DisplayName("Should raise exception when file position of chessman on the board is out of bounds")
    @ParameterizedTest(name = "[{index}]: File position=''{0}''")
    @ValueSource(ints = {0, 9})
    public void shouldRaiseException_whenFilePositionIsOutOfBounds(int boardFilePosition) {
        int validBoardRankPosition = 1;
        assertThrows(IllegalArgumentException.class, () -> new ChessPosition(validBoardRankPosition, boardFilePosition));
    }

    @DisplayName("Should not raise any exception when valid position is passed")
    @ParameterizedTest(name = "[{index}]: Rank or File position=''{0}''")
    @ValueSource(ints = {1,2,3,4,5,6,7,8})
    public void shouldNotRaiseAnything_whenFileOrRankPositionIs(int boardFileOrRankPosition) {
        new ChessPosition(boardFileOrRankPosition, boardFileOrRankPosition);
    }

}