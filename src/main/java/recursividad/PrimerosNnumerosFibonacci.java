package recursividad;

import java.util.Scanner;

public class PrimerosNnumerosFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, digita el número de valores de la serie fibonacci que quieres ver");
        int n= scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(imprimirNNumerosFibonacci(i)+",");
        }
    }

    static int imprimirNNumerosFibonacci(int n){
        if (n<2){
            return n;

        }
        return imprimirNNumerosFibonacci(n-1)+ imprimirNNumerosFibonacci (n-2);

    }
}
