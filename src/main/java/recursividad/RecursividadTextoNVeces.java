package recursividad;

import java.util.Scanner;

//El usuario le da un texto y la cantidad de veces que quiere que se repita el texto
public class RecursividadTextoNVeces {
    public static void main(String[] args) {
        System.out.println("Cual es tu texto");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        System.out.println("Cuantas veces quieres que se repita");
        int veces = scanner.nextInt();
        imprimeTextoNVeces(texto, veces);
    }

    static void imprimeTextoNVeces(String texto, int veces) {
        if (veces == 0) {
            return;
        }
        System.out.println(texto);
        imprimeTextoNVeces(texto, veces -1);

    }

}
