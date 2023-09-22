package CH8;

import java.util.Scanner;

public class CheckSudoku8_4 {
    public static void main(String[] args) {
        int sudoku[][] = new int[9][9];
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = iScanner.nextInt();
            }
        }
        System.out.println((isValid(sudoku) ? "Valid" : "Not Valid"));
    }

    public static boolean isValid(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] < 1 || sudoku[i][j] > 9 || !isValid(sudoku, i, j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isValid(int sudoku[][], int i, int j) {

        for (int c = 0; c < 9; c++)
            if (sudoku[i][j] == sudoku[i][c] && j != c)
                return false;

        for (int r = 0; r < 9; r++)
            if (sudoku[i][j] == sudoku[r][j] && i != r)
                return false;

        for (int r = (i / 3) * 3; r < ((i / 3) * 3) + 3; r++)
            for (int c = (j / 3) * 3; c < ((j / 3) * 3) + 3; c++)
                if (sudoku[i][j] == sudoku[r][j] && (i != r && j != c))
                    return false;

        return true;
    }
}
