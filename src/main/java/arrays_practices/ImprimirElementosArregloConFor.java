package arrays_practices;

public class ImprimirElementosArregloConFor {
    public static void main(String[] args) {

        System.out.println("Primer arreglo ");
        imprimirArregloInstanciadoDesdeElInicio();
        System.out.println("El arreglo ya inicializado es: ");
        imprimirArregloInicializadoDesdeElInicio();


    }

    static void imprimirArregloInstanciadoDesdeElInicio() {
        int[] arregloMonty; //Declaro
        arregloMonty = new int[3]; //instancio
        arregloMonty[0] = 1; //inicializo
        arregloMonty[1] = 2;
        arregloMonty[2] = 3;
        for(int i= 0; i<arregloMonty.length; i++) {
            System.out.println(arregloMonty[i]);
        }

    }

    static void imprimirArregloInicializadoDesdeElInicio() {
        int[] arregloInicializado = {9,9,9,9,9};

        for(int i = 0; i<arregloInicializado.length; i++) {
            System.out.println(arregloInicializado[i]);

        }

    }

}
