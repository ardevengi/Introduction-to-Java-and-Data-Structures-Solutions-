package CH7;

public class Sorted7_19 {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 3, 6, 2, 4 };
        int arr2[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Arr1 is " + (isSorted(arr1) ? "Sorted" : "Not Sorted"));
        System.out.println("Arr2 is " + (isSorted(arr2) ? "Sorted" : "Not Sorted"));
    }

    public static boolean isSorted(int[] arr) {
        int sStatus;
        if (arr[0] <= arr[1])
            sStatus = 1;
        else
            sStatus = -1;

        if (sStatus == 1) {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1])
                    return false;
            }
        } else {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1])
                    return false;
            }
        }

        return true;
    }
}
