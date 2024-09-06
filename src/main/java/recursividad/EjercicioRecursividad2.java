package recursividad;

public class EjercicioRecursividad2 {
    public static void main(String[] args) {

        EjercicioRecursividad2 ejercicioRecursividad2 = new EjercicioRecursividad2();

        ejercicioRecursividad2.imprimirValor(8);

    }

    //Aquí, si el usuario da un numero mayor que uno, la recursividad entrará después de imprimir el numero, luego
    //el metodo se llamara a si mismo pero restando una unidad a ese valor, hasta que el numero ahora sea uno. En ese momento,
    //finalizara la recursividad
    public void imprimirValor(int x){
        if(x==1) {
            System.out.println("Tu numero ya es igual que 1, finaliza la recursividad");
        } else {
            System.out.println(x);
            imprimirValor(x-1);

        }
    }
}
