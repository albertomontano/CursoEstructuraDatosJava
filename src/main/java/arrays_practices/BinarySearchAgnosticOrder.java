package arrays_practices;

public class BinarySearchAgnosticOrder {
    public static void main(String[] args) {
        int target = 8;
        int[] array = {8,7,6,5,4,3,2,1};
        int ans = binarySearchAgnosticOrder(array, target);
        System.out.println("El índice del objetivo es: " + ans);
    }

    static int binarySearchAgnosticOrder(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAscending = array[start] < array[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == array[middle]){
                    return middle;
            }
            if (isAscending == true) {
                if (target < array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
