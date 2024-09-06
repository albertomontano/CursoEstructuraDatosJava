package arrays_practices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CambioDelValorDeUnElementoDelArreglo {
    public static void main(String[] args) {
        int[] arregloACambiar = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arregloACambiar));
        cambioDeValorDeUnElemento(arregloACambiar);
        System.out.println(Arrays.toString(arregloACambiar));

    }

    static void cambioDeValorDeUnElemento(int[] arreglo) {
        arreglo[0] = 999;
    }

}
