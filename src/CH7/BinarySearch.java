package CH7;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(bSearch(arr, 10));
    }

    public static int bSearch(int[] arr, int num) {
        int high = arr.length - 1, low = 0;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (num < arr[mid])
                high = mid - 1;
            else if (num > arr[mid])
                low = mid + 1;
            else
                return mid;

        }
        return -1;
    }

}
