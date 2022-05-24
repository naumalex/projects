package Lesson4.Homework;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        final int n = 3;
        Scanner sc = new Scanner(System.in);
        char[][] masOfMoves = new char[n][n];
        int x = 0;
        int y = 0;
        int player = 1;
        boolean isValidDataEntered;
        int maxStepsNumber = n * n;
        for ( int stepNumber = 0; stepNumber < maxStepsNumber; stepNumber++) {
            System.out.printf("Player %d, please enter coordinates (x,y)%n", player);
            isValidDataEntered = false;
            while (!isValidDataEntered) {
                if (sc.hasNextInt())
                    x = sc.nextInt();
                else {
                    System.out.println("Invalid integer value");
                    sc.next();
                    continue;
                }
                if (sc.hasNextInt())
                    y = sc.nextInt();
                else {
                    System.out.println("Invalid integer value");
                    sc.next();
                    continue;
                }
                if ((x > 2) || (y > 2) || (x < 0) || (y < 0)) {
                    System.out.println("x and y should be between 0 and 2");
                    continue;
                }
                if ((masOfMoves[x][y] == 'X') || (masOfMoves[x][y] == 'O')) {
                    System.out.println("The cell already have X or O");
                    continue;
                }
                isValidDataEntered = true;
            }
            masOfMoves[x][y] = (player == 1) ? 'X': 'O';
            for (int i = 0; i < masOfMoves.length; i++) {
                for (int j = 0; j < masOfMoves[i].length; j++) {
                    System.out.printf("%c ", masOfMoves[i][j]);
                }
                System.out.println();
            }
            String raw = "";
            String column = "";
            String diagonalOne = "";
            String diagonalTwo = "";
            for (int i = 0; i < n; i++) {
                raw += masOfMoves[x][i];
                column += masOfMoves[i][y];
                if (x == y)
                    diagonalOne += masOfMoves[i][i];
                if ((x + y) == (n - 1))
                    diagonalTwo += masOfMoves[i][n - 1 - i];
            }
            String stringToCompare = (player == 1) ? "XXX" : "OOO";
            if ((raw.equals(stringToCompare)) || (column.equals(stringToCompare)) ||
                    (diagonalOne.equals(stringToCompare)) || (diagonalTwo.equals(stringToCompare))) {
                System.out.printf("Game over. Player %d has won", player);
                System.exit(0);
            }
            player = (player == 1) ? 2 : 1;
        }
        System.out.println("Game over. Draw");
    }
}
