package board;

final class ChessBoardPositionTranslator {

    private static final int ASCII_DIFF_BETWEEN_LETTERS_AND_FIRST_NUMS = 'A' - '1';
    private static final int FIRST_NUM_IN_ASCII = 48;
    private static final int NUM_TO_LETTER_CONVERTER_VALUE = ASCII_DIFF_BETWEEN_LETTERS_AND_FIRST_NUMS + FIRST_NUM_IN_ASCII;

    private ChessBoardPositionTranslator() {

    }

    public static String translateNumericPositionToBoardNotation(int rankPosition, int filePosition) {
        return String.valueOf(translateRankPositionToAppropriateLetter(rankPosition)) + filePosition;
    }

    private static char translateRankPositionToAppropriateLetter(int rankPosition) {
        return (char) (rankPosition + NUM_TO_LETTER_CONVERTER_VALUE);
    }
}
