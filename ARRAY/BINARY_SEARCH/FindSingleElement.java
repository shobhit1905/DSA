package ARRAY.BINARY_SEARCH;

public class FindSingleElement {
    public static int findSingleElement(int[] arr) {
        if (arr.length == 1)
            return arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1])
                    return arr[0];
            } else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    return arr[arr.length - 1];
                }
            } else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                    return arr[i];
            }
        }

        return -1;
    }

    public static int findElement(int[] arr) {
        if (arr.length == 1)
            return arr[0];

        if (arr[0] != arr[1])
            return arr[0];

        if (arr[arr.length - 1] != arr[arr.length - 2])
            return arr[arr.length - 1];

        int low = 1, high = arr.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];
            if ((mid % 2 == 1 && arr[mid] == arr[mid-1]) || (mid % 2 == 0 && arr[mid] == arr[mid+1]))
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10 };
        int[] b = { 10 };
        int[] c = { 20, 20 };

        System.out.println(findElement(a));
        System.out.println(findElement(b));
        System.out.println(findElement(c));

    }
}
