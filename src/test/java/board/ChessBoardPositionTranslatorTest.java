package board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessBoardPositionTranslatorTest {

    static Stream<Object[]> boardPositionsAndExpectedChessNotation() {
        return Stream.of(new Object[][]
                {       {1, 1, "A1"},
                        {2, 2, "B2"},
                        {3,8,"C8"},
                        {4,7,"D7"},
                        {5,4,"E4"},
                        {6,3,"F3"},
                        {7,6,"G6"},
                        {8,5,"H5"}
                });
    }

    @DisplayName("Should properly translate rank and file position of chessman to chess notation of board position")
    @ParameterizedTest(name = "[[{index}]]: Position of chessman on the board: [{0}:{1}], expected position using chess notation: {2}")
    @MethodSource(value = "boardPositionsAndExpectedChessNotation")
    public void shouldReturnProperChessNotationOfPosition_whenInterpretingFileAndRankPosition(int rankPosition, int filePosition, String expectedPositionUsingBoardNotation) {

        String actualBoardPosition = ChessBoardPositionTranslator.translateNumericPositionToBoardNotation(rankPosition,filePosition);

        assertEquals(expectedPositionUsingBoardNotation,actualBoardPosition);
    }
}