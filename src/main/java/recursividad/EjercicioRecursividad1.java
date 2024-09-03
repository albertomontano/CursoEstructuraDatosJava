package recursividad;

public class EjercicioRecursividad1 {

    public static void main(String[] args) {

        EjercicioRecursividad1 imprimir1 = new EjercicioRecursividad1();
        imprimir1.imprimir(5);

    }

    public void imprimir(int x) {
        if(x<=10){
            System.out.print(x + " ");
            imprimir(x+1);
        } else {
            System.out.println("Tu numero es mayor a 10, no entra la recursividad");
        }
    }


}
