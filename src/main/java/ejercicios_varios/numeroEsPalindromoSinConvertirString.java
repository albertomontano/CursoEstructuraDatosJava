package ejercicios_varios;

public class numeroEsPalindromoSinConvertirString {
    public static boolean esPalindromo(int x) {
        // Los números negativos no son palíndromos
        if (x < 0) {
            return false;
        }

        // Almacenar el número original
        int numeroOriginal = x;
        int invertido = 0;

        // Invertir el número
        while (x != 0) {
            int digito = x % 10;
            invertido = invertido * 10 + digito;
            x /= 10;
        }

        // Comparar el número original con el invertido
        return numeroOriginal == invertido;
    }

    public static void main(String[] args) {
        int numero = 121;
        System.out.println("¿Es palíndromo? " + esPalindromo(numero)); // true

        numero = -121;
        System.out.println("¿Es palíndromo? " + esPalindromo(numero)); // false

        numero = 123;
        System.out.println("¿Es palíndromo? " + esPalindromo(numero)); // false
    }
}
