package ejercicios_varios;

public class CambioValorVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("El primer valor de a es " + a + "Y el primer valor de b es " + b);
        cambioValor(a, b);
    }

    static void cambioValor(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("El nuevo valor de a es " + x + "El nuevo valor de b es " + y);


    }

}
