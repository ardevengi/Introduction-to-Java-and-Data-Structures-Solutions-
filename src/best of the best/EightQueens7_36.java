package CH7;

public class EightQueens7_36 {
    public static void main(String[] args) {
        final int N = 16;
        int table[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(table[i][j]);

            System.out.println();
        }
        System.out.println("---------------------");

        boolean can = queens(table, 0, N);
        if (can)
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(table[i][j]);

                System.out.println();
            }
        else
            System.out.println("cont be solve");
    }

    public static boolean queens(int[][] table, int row, int N) {
        if (row == N)
            return true;
        for (int j = 0; j < N; j++) {
            if (safe(table, row, j, N)) {
                table[row][j] = 1;

                if (queens(table, row + 1, N))
                    return true;

                table[row][j] = 0;
            }
        }
        return false;

    }

    public static boolean safe(int[][] table, int row, int col, int N) {

        for (int i = 0; i < N; i++)
            if (table[i][col] == 1)
                return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (table[i][j] == 1)
                return false;

        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (table[i][j] == 1)
                return false;

        return true;
    }
}
