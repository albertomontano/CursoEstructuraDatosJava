package arrays_practices;

import java.util.Arrays;

public class SwapValuesFromArray {
    public static void main(String[] args) {
        int[] arrayToSwap = {4,6,23,99,56};
        swapValues(arrayToSwap, 0, 1);

    }

    static void swapValues(int[] arrayToSwap, int indexA, int indexB) {
        System.out.println("Array original es " + Arrays.toString(arrayToSwap));
        int temp = arrayToSwap[indexA];
       arrayToSwap[indexA] = arrayToSwap[indexB];
       arrayToSwap[indexB] = temp;


        System.out.println("Valores modificados:" + arrayToSwap[indexA] + ", " + arrayToSwap[indexB]);
        System.out.println("Array modificado es " + Arrays.toString(arrayToSwap));
    }
}
