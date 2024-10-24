package recursividad;

import java.util.Scanner;

public class ImprimirNumerosDel1alN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el valor límite del rango de numeros que quieres imprimir");
        int n = scanner.nextInt();
        imprimirNumerosRecursividad(n);
    }
    static void imprimirNumerosRecursividad(int n) {
        if (n == 0){
            return;
        }
        imprimirNumerosRecursividad(n-1);
        System.out.println(n);


    }



}
