package CH7;

import java.util.Scanner;

public class Partition7_32 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Number : ");
        int n = iScanner.nextInt();

        int numbers[] = new int[n];

        int pivot = numbers[0] = iScanner.nextInt();

        for (int i = 1; i < n; i++) {
            numbers[i] = iScanner.nextInt();
        }

        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();

        partitionSort(numbers, pivot);

        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");

    }

    public static void partitionSort(int[] numbers, int pivot) {
        int k = 0, newArr[] = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < pivot)
                newArr[k++] = numbers[i];
        }
        newArr[k++] = pivot;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > pivot)
                newArr[k++] = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = newArr[i];

    }
}
