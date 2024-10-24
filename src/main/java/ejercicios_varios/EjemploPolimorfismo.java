package ejercicios_varios;

public class EjemploPolimorfismo {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends EjemploPolimorfismo{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gato extends EjemploPolimorfismo{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }

}

class PruebaAnimal{

    // Metodo polimorfico-- El objeto con el que se trabaja es uno de la clase padre
    static void imprimirSonido(EjemploPolimorfismo animal){
        animal.hacerSonido(); //Nos traemos un metodo que parece ser de la clase padre, pero que va a poder ejecutarse de acuerdo al tipo de objeto
    }

    public static void main(String[] args) {
        // Objeto de la clase Padre (Animal)
        EjemploPolimorfismo animal = new EjemploPolimorfismo();
        imprimirSonido(animal); //Aqui el metodo polimorfico ejecuta el mensaje de la clase padre

        //Objeto de la clase Hija Perro:
        Perro animalPerro = new Perro();
        imprimirSonido(animalPerro);

        //Objeto de la clase Hija Gato:
        Gato animalGato = new Gato();
        imprimirSonido(animalGato); //Aqui el metodo polimorfico ejecuta el mensaje de la clase hija

        System.out.println(animalGato.toString());
        System.out.println(animalGato.hashCode());
        System.out.println(animalGato.getClass().getName());
        System.out.println(animalGato.getClass());
    }
}