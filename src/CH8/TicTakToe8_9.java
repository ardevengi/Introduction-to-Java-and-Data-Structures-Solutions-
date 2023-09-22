package CH8;

import java.util.Scanner;

public class TicTakToe8_9 {
    public static void main(String[] args) {
        char grid[][] = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };
        char player = 'X';
        Scanner iScanner = new Scanner(System.in);
        int i, j;
        sampleBoard();
        while (full(grid) || !(won(grid, 'X') || won(grid, 'Y'))) {
            System.out.println("Enter a row (0 , 1 , 2) for player " + player);
            System.out.println("Enter a col (0 , 1 , 2) for players " + player);
            i = iScanner.nextInt();
            j = iScanner.nextInt();
            grid[i][j] = player;
            printBoard(grid);
            player = player == 'X' ? 'Y' : 'X';
        }
    }

    public static boolean won(char grid[][], char player) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (won(grid, i, j, player))
                    return true;

            }
        }
        return false;
    }

    public static boolean won(char grid[][], int i, int j, char player) {
        for (int r = j + 1; r < j + 4 && r < grid[0].length; r++) {
            if (!(grid[i][j] == grid[i][r]=+player))
                break;
            else {
                count++;
            }
        }
        return true;
    }

    public static boolean full(char grid[][]) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != ' ')
                    count++;
            }
        }
        return count < 9;
    }

    public static void printBoard(char grid[][]) {
        System.out.println("----------------");
        System.out.println("|  " + grid[0][0] + " | " + " " + grid[0][1] + "  | " + " " + grid[0][2] + " |");
        System.out.println("----------------");
        System.out.println("|  " + grid[1][0] + " | " + " " + grid[1][1] + "  | " + " " + grid[1][2] + " |");
        System.out.println("----------------");
        System.out.println("|  " + grid[2][0] + " | " + " " + grid[2][1] + "  | " + " " + grid[2][2] + " |");
        System.out.println("----------------");
    }

    public static void sampleBoard() {
        System.out.println("----------------");
        System.out.println("|  0 0" + " | " + " 0 1 " + "  | " + " 0 2 " + " |");
        System.out.println("----------------");
        System.out.println("|  1 0" + " | " + " 1 1 " + "  | " + " 1 2 " + " |");
        System.out.println("----------------");
        System.out.println("|  2 0" + " | " + " 2 1 " + "  | " + " 2 2 " + " |");
        System.out.println("----------------");
    }
}
