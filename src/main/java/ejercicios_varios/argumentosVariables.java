package ejercicios_varios;

import java.util.Arrays;
import java.util.Scanner;

public class argumentosVariables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los 3 primeros elementos enteros");
        funcionArgumentosVariablesEnteros(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("ingrese los 3 primeros elementos string");
        funcionArgumentosVariablesStrings(sc.next(), sc.next(), sc.next());
        System.out.println("ingrese el primer elemento entero, luego el segundo entero, luego los 3 primeros elementos string");
        funcionArgumentosVariablesMixtos(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next());




    }

    //Ejemplo de argumentos variables de puros int en una funcion
    static void funcionArgumentosVariablesEnteros(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    //Ejemplo de argumentos variables de puros strings en una funcion
    static void funcionArgumentosVariablesStrings (String ...v) {
        System.out.println(Arrays.toString(v));
    }

    //Ejemplo de argumentos variables mixto de int con string
    static void funcionArgumentosVariablesMixtos (int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }

}
