package recursividad;

public class EjercicioRecursividad2 {
    public static void main(String[] args) {

        EjercicioRecursividad2 ejercicioRecursividad2 = new EjercicioRecursividad2();

        ejercicioRecursividad2.imprimirValor(6);

    }


    public void imprimirValor(int x){
        if(x==1) {
            System.out.println("Tu numero ya es igual que 1, finaliza la recursividad");
        } else {
            System.out.println(x);
            imprimirValor(x-1);
            
        }
    }
}
