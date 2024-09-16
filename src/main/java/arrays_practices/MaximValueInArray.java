package arrays_practices;

public class MaximValueInArray {

    public static void main(String[] args) {
        int[] array1 = {2,4,5,1,7,34,6,98,23,4};
        System.out.println(getMaximValue(array1));
    }

    static int  getMaximValue(int[] array) {
        /* Primero creamos una variable para almacenar maxValue, la iniciamos en el index 0 del arreglo para que
        tome el valor del primer valor del arreglo, el cual es el que vamos a comparar con el resto de los valores del
        arreglo.
        Iniciamos el ciclo for en el cual el contador i aquí empieza en 1, debido a que nuestro índice 0 ya lo guardamos
        en el max value y no tiene caso que se compare a sí mismo.
        Mientras que el contador i sea menor a la longitud del arreglo, se recorrerá el arreglo.
        Dentro de nuestro ciclo for, tenemos la comparación, en la cual el índice del arreglo que corresponda a nuestro contador i,
        se comparará con el max value y si es mayor que maxValue, tomará su lugar.
         */
       int maxValue = array[0];
       for(int i = 1; i< array.length; i++) {
           if(array[i] > maxValue) {
               maxValue = array[i];
           }
       }
       return maxValue;


    }


}
