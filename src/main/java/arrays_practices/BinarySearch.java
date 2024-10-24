package arrays_practices;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 8;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int ans = binarySearch(array, target);
        System.out.println("El índice del objetivo es: " + ans);
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }
}
