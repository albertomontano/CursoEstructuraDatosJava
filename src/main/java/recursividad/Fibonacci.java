package recursividad;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5; // Cambia este valor para obtener otro número en la serie
        System.out.println("El " + n + "º número de Fibonacci es: " + fibonacciRecursivo(n));
    }

    public static int fibonacciRecursivo(int n) {
        if (n < 2) {
            return n; // Caso base
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2); // Llamada recursiva
    }
}
