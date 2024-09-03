package arrays_practices;

import java.util.Arrays;

public class FirstArrays {
    public static void main(String[] args) {
        int[] myFirstArray;  //Declaration
        myFirstArray = new int[10];     //Instantiation
        myFirstArray[0] = 1;            //Initialization
        myFirstArray[1] = 2;
        myFirstArray[2] = 3;
        myFirstArray[3] = 4;
        myFirstArray[4] = 5;
        myFirstArray[5] = 6;
        myFirstArray[6] = 7;
        myFirstArray[7] = 8;
        myFirstArray[8] = 9;
        myFirstArray[9] = 10;
        System.out.println(myFirstArray[0]);
        System.out.println(myFirstArray[1]);
        System.out.println(Arrays.toString(myFirstArray));
        System.out.println(Arrays.toString(mySecondArray));
        System.out.println(Arrays.toString(myThirdArray));

    }

    //Declaration, instantiation, initialization all in once
    public static int mySecondArray[] = {4,6,3,3};

    public static String myThirdArray[] = {"Pepe", "Juan", "Meli"};


}
