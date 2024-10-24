package ejercicios_varios;

public interface PracticaInterface {
    //metodo que es public y abstract
    void traducir();

    //metodo que tiene una implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor");
    }
}

class Ingles implements PracticaInterface{
    @Override
    public void traducir() {
        System.out.println("Traducciendo Ingles");
    }

    //public void iniciarTraductor(){}
}

class Frances implements PracticaInterface{
    public void traducir() {
        System.out.println("Traducciendo Frances");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando el traductor Frances");
    }

}

class PruebaTraductor{
    public static void main(String[] args) {
        Ingles ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();
        Frances frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();


    }
}
