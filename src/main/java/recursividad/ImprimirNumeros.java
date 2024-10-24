package recursividad;

//Imprimir números del 1 al 5 usando recursividad
public class ImprimirNumeros {
    public static void main(String[] args) {
        funct(1);
    }

    static void funct(int n) {
        int k = 5;
        if (n ==k){
            System.out.println(k);
            return;

        }
        System.out.println(n);
        funct(n+1);

    }

}
