public class BinarySearch {
    static int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] arr, int l, int h, int value) {
        if (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] == value) {
                return m;
            } else if (arr[m] < value) {
                return binarySearch(arr, m+1, h, value);
            } else {
                return binarySearch(arr, l, m-1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr, 0, arr.length-1, 59));
        System.out.println(binarySearch(arr, 0, arr.length-1, 2));
        System.out.println(binarySearch(arr, 0, arr.length-1, 77));
        System.out.println(binarySearch(arr, 0, arr.length-1, 0));

    }
}



