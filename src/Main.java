public class Main {

    public static void(String[] args) {
    }

    public class TicTacToe {

        public static final int FIELD_SIZE = 5;
        public static final int DOTS_TO_WIN = 4;

        public static final char EMPTY_DOT = '.';
        public static final char PLAYER_1_DOT = 'X';
        public static final char PLAYER_2_DOT = 'O';

        public static Scanner input = new Scanner(System.in);
        public static char[][] gameField;

        public static void initGameField() {
            gameField = new char[FIELD_SIZE][FIELD_SIZE];
            for (int i = 0; i < FIELD_SIZE; i++) {
                for (int j = 0; j < FIELD_SIZE; j++) {
                    gameField[i][j] = EMPTY_DOT;
                }
            }
        }

        public static void printGameField() {
            for (int i = 0; i <= gameField.length; i++) {
                System.out.print(i == 0 ? "  " : i + " ");
            }
            System.out.println();
            for (int i = 0; i < gameField.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < gameField.length; j++) {
                    System.out.print(gameField[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}