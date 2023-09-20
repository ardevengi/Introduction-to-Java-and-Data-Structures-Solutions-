package CH7;

public class BubbleSort7_18 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 6, 2, 4 };
        BSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void BSort(int[] scores) {
        for (int i = 0; i < scores.length; i++) {

            for (int j = 0; j < scores.length - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
    }
}
