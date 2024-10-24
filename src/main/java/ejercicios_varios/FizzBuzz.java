package ejercicios_varios;
//Given an integer n, return a string array answer(1-indexed)where:
//"FizzBuzz if i is divisible by 3 and 5
//Fizz if i is divisible by 3
//Buzz if i is divisible by 5
//i as a String if none of the above conditions are tru
public class FizzBuzz {
    public static void main(String[] args) {
        int n= 15;

        System.out.println(fizzBuzz(n));

    }


     public static String fizzBuzz (int n){
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";

        } else if (n % 3 == 0) {
            return "Fizz";
        }
        else if (n % 5 == 0) {
            return "Buzz";
        }else {
            return "i";

        }

    }
}
