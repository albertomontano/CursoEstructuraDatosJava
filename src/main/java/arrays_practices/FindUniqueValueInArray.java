package arrays_practices;

import java.util.ArrayList;

public class FindUniqueValueInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 4, 3, 2, 2};
        uniqueFinder(arr);

    }
    static void uniqueFinder(int[] arr){

        //Tenemos que crear un ArrayList como auxiliar donde vamos a ir guardando los valores
        ArrayList<Integer> auxiliarList = new ArrayList<Integer>();
        //Procedemos a crear un ciclo for que va a recorrer todos los elementos del arreglo
        for(int i=0; i< arr.length; i++){
            //Dentro de nuestro loop for, tenemos que crear una variable auxiliar K.
            int k=0; //Esta la iniciamos en cero, es la variable que va ir almacenando la cantidad de veces que se repite i

            //Dentro de nuestro ciclo for, tenemos que crear una condicinal que va a revisar si i NO se encuentra en el ArrayList.
            //Si es que el valor de i NO se encuentra en el ArrayList, tenemos que agregarlo.
            //Esto es debido a que tenemos que ir guardando los valores en el ArrayList.
            if (!auxiliarList.contains(arr[i])){
                auxiliarList.add(arr[i]); //usamos el metodo add que corresponde al arrayList creado para guardar el valor de i
                k++; //De igual manera, al haberse cumplido la condicion en la que estamos, a k le aumentamos un valor

                //A continuacion, entramos a otro ciclo for. En este vamos crear otra variable j la cual va a recorrer el arreglo
                //Creamos este otro ciclo for para que se valide si i y j son iguales. En caso de que si sean iguales, entonces
                //la variable k que creamos dentro del primer loop for, va a incrementar su valor.
                for (int j = i+1; j< arr.length; j++){
                    if (arr[i] == arr[j]){
                        k++;
                    }
                }
                System.out.println("El valor " + arr[i] + " se repite " + k + " veces");
                if (k==1) {System.out.println("El valor unico del array es " +arr[i]); }
                //Una vez que finaliza la validacion de la condicion anterior,

            }


        }

    }

}

