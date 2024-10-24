package sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 1};
        bubble(array);
        System.out.println(Arrays.toString(array));

    }

    static void bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
        //Por cada corrida o paso, el elemento máximo se va a mover al ultimo indice del arreglo
            for (int j = 1; j <= array.length - i - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}