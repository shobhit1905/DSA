package ARRAY.BINARY_SEARCH;

public class PeakElement {
    public static void printPeakElements(int[] arr) {
        if (arr[0] > arr[1])
            System.out.println(arr[0]);
        if (arr[arr.length - 1] > arr[arr.length - 2])
            System.out.println(arr[arr.length - 1]);

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static int peakElement(int[] arr) {

        if (arr.length == 1)
            return arr[0];

        if (arr[0] > arr[1])
            return arr[0];

        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1];

        int low = 1, high = arr.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return arr[mid];
            else if (arr[mid] > arr[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 1 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] c = { 6, 5, 4, 3, 2 };
        int[] d = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(peakElement(a));
        System.out.println(peakElement(b));
        System.out.println(peakElement(c));
        System.out.println(peakElement(d));
    }
}
