package CH8;

public class Sort2d8_16 {
    public static void main(String[] args) {
        int arr[][] = {
                { 4, 2 },
                { 6, 7, 3 },
                { 4, 5 },
                { 6, 7, 6 },
                { 6, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j]);
            System.out.println();

        }
        System.out.println("----------------------------");
        BSort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j]);
            System.out.println();

        }
        System.out.println("----------------------------");
    }

    public static void BSort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i][0] < arr[j][0]) {
                    int tmp[] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                } else if (arr[i][0] == arr[j][0]) {
                    int x = 1, y = 1;
                    while (x < arr[i].length && y < arr[j].length)
                        if (arr[i][x++] < arr[j][y++]) {

                            int tmp[] = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                        }
                }

            }
        }
    }
}
