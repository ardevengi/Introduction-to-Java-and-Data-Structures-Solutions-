
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

        do {
            System.out.println("Enter a row (0 , 1 , 2) for player " + player);
            System.out.println("Enter a col (0 , 1 , 2) for players " + player);
            i = iScanner.nextInt();
            j = iScanner.nextInt();
            grid[i][j] = player;
            printBoard(grid);
            player = player == 'X' ? 'Y' : 'X';
        } while (!full(grid) && !won(grid));
    }

    public static boolean won(char grid[][]) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (won(grid, i, j))
                    return true;

            }
        }
        return false;
    }

    public static boolean won(char grid[][], int i, int j) {
        if (grid[i][j] != ' ') {
            int count = 1;
            for (int r = j + 1; r < j + 3 && r < grid[0].length; r++) {
                if (!(grid[i][j] == grid[i][r]) && (grid[i][j] != ' '))
                    break;
                else {
                    count++;
                }
            }

            if (count == 3) {
                System.out.println("the winner is horizontal " + grid[i][j]);
                return true;
            }
            count = 1;

            for (int c = i + 1; c < i + 3 && c < grid.length; c++) {
                if (!(grid[i][j] == grid[c][j]) && (grid[i][j] != ' '))
                    break;
                else {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("the winner is vertical" + grid[i][j]);
                return true;
            }
            count = 1;

            for (int c = i + 1, r = j - 1; c < i + 3 && c < grid.length && r > j - 3 && r >= 0; r--, c++) {
                if (!(grid[i][j] == grid[c][r]) && (grid[i][j] != ' '))
                    break;
                else {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("the winner is l diagonal" + grid[i][j]);
                return true;
            }
            count = 1;
            for (int c = i + 1, r = j + 1; c < i + 3 && c < grid.length && r < j + 3 && r < grid[0].length; r++, c++) {
                if (!(grid[i][j] == grid[c][r]) && (grid[i][j] != ' '))
                    break;
                else {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("the winner is r diagonal" + grid[i][j]);
                return true;
            }
        }
        return false;
    }

    public static boolean full(char grid[][]) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != ' ')
                    count++;
            }
        }
        return count > 9;
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
