package ejercicios_varios;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el numero que quieres revisar si es primo o no");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));


    }

    static boolean isPrime(int n){
        if (n%2==0) {
            return false;
        }return true;

    }

}
