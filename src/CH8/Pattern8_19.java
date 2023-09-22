package CH8;

import java.util.Scanner;

public class Pattern8_19 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter nxn : ");
        int n = iScanner.nextInt();
        int grid[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = iScanner.nextInt();
            }
        }
        System.out.println((check(grid) ? "Valid" : "Not Valid"));
    }

    public static boolean check(int grid[][]) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (check(grid, i, j))
                    return true;
            }
        }

        return false;

    }

    public static boolean check(int grid[][], int i, int j) {
        int count = 1;
        for (int r = j + 1; r < j + 4 && r < grid[0].length; r++) {
            if (!(grid[i][j] == grid[i][r]))
                break;
            else {
                count++;
            }
        }
        if (count == 4)
            return true;
        count = 1;

        for (int c = i + 1; c < i + 4 && c < grid.length; c++) {
            if (!(grid[i][j] == grid[c][j]))
                break;
            else {
                count++;
            }
        }
        if (count == 4)
            return true;
        count = 1;

        for (int c = i + 1, r = j - 1; c < i + 4 && c < grid.length && r > j - 4 && r >= 0; r--, c++) {
            if (!(grid[i][j] == grid[c][r]))
                break;
            else {
                count++;
            }
        }

        for (int c = i + 1, r = j + 1; c < i + 4 && c < grid.length && r < j + 4 && r < grid[0].length; r++, c++) {
            if (!(grid[i][j] == grid[c][r]))
                break;
            else {
                count++;
            }
        }

        if (count == 4)
            return true;
        count = 1;

        return false;

    }
}
