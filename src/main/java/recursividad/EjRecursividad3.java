package recursividad;

public class EjRecursividad3 {
    public static void main(String[] args) {

        EjRecursividad3 obj = new EjRecursividad3();
        obj.imprimir3(7);

    }

    //Aqui, si el usuario ingresa un valor que es menor que 10, el metodo se invocara a si mismo, usando la recursividad, en este caso,
    //despues de imprimir el valor del numero ingresado, el metodo se sumara a si mismo, hasta que el valor sea igual o menor que 10.
    //Una vez que el numero sea igual o mayor que 10, se ejecuta el bloque if y termina la ejecucion

    public void imprimir3(int x){
        if(x>=10){
            System.out.println("Tu numero ya es igual o mayor que 10");

        } else {
            System.out.println(x);
            imprimir3(x + 1);
        }
    }

}
