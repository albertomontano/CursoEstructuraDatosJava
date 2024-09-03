package recursividad;

public class EjRecursividad3 {
    public static void main(String[] args) {

        EjRecursividad3 obj = new EjRecursividad3();
        obj.imprimir3(5);

    }

    public void imprimir3(int x){
        if(x==10){
            System.out.println("Tu numero ya es igual o mayor que 10");

        } else {
            System.out.println(x);
            imprimir3(x + 1);
        }
    }

}
