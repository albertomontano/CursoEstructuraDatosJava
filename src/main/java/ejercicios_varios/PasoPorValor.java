package ejercicios_varios;

public class PasoPorValor {
    public static void main(String[] args) {
        int arg1 = 10;
        System.out.println(cambioDeValores(arg1));

    }

    public static int cambioDeValores(int arg1){
        arg1 = 12;
        return arg1;
    }

}
