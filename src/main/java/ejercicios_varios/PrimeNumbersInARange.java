package ejercicios_varios;

import java.util.Scanner;

public class PrimeNumbersInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el valor límite del rango que quieres que te de los numeros primos");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i +" ");
        }

    }



}
