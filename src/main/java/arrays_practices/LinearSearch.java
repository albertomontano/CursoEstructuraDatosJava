package arrays_practices;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myArray = {2,3,6,29,8,44,5};
        int target = 6;
        int answer = linearSearchAlgo(myArray, target);
        System.out.println(answer);
        System.out.println(linearSearchAlgo(myArray, target));
    }

    static int linearSearchAlgo(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
