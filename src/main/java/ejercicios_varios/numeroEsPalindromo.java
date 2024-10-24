package ejercicios_varios;

public class numeroEsPalindromo {
    public static boolean esPalindromo(int x) {
        // Los números negativos no son palíndromos
        if (x < 0) {
            return false;
        }

        // Convertir el número a String para facilitar la comparación
        String original = String.valueOf(x);
        String invertido = new StringBuilder(original).reverse().toString();

        // Verificar si el número original es igual al número invertido
        return original.equals(invertido);
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

