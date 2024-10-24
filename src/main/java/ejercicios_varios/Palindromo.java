package ejercicios_varios;

    public class Palindromo {
        public static void main(String[] args) {
            String[] palabras = {"Ana", "Oso", "Radar", "A ti no, bonita", "Java"};

            for (String palabra : palabras) {
                System.out.println("'" + palabra + "' es palíndromo? " + esPalindromo(palabra));
            }
        }

        public static boolean esPalindromo(String cadena) {
            // Convertir a minúsculas y eliminar espacios, puntos y comas
            cadena = cadena.toLowerCase().replaceAll("[\\s.,]", "");

            // Invertir la cadena
            String invertida = new StringBuilder(cadena).reverse().toString();

            // Comparar la cadena original con la invertida
            return cadena.equals(invertida);
        }


    }
