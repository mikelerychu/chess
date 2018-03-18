package board;

public class ChessPosition {

    private static final int MINIMUM_POSITION = 1;
    private static final int MAXIMUM_POSITION = 8;
    private final int boardRank;
    private final int boardFile;

    public ChessPosition(int boardRank, int boardFile) {
        validateBoardRankPosition(boardRank);
        validateBoardFilePosition(boardFile);
        this.boardRank = boardRank;
        this.boardFile = boardFile;
    }

    public int getBoardRank() {
        return boardRank;
    }

    public int getBoardFile() {
        return boardFile;
    }

    private void validateBoardRankPosition(int boardRank)
    {
        if(boardRank<MINIMUM_POSITION || boardRank>MAXIMUM_POSITION)
        {
            throw new IllegalArgumentException("Rank position of chessman on the board must be between 0 and 7 (A-H), but was: "+boardRank);
        }
    }

    private void validateBoardFilePosition(int boardFile) {
        if(boardFile<MINIMUM_POSITION || boardFile>MAXIMUM_POSITION)
        {
            throw new IllegalArgumentException("File position of chessman on the board must be between 0 and 7, but was: "+boardFile);
        }
    }


    public String getPositionUsingChessBoardNotation() {
        return ChessBoardPositionTranslator.translateNumericPositionToBoardNotation(boardRank,boardFile);
    }
}
