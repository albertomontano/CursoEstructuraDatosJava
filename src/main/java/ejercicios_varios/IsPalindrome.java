package ejercicios_varios;


public class IsPalindrome {

    /*
Given a string s, return true if it is a palindrome, or false otherwise.
Approach 1: Compare with Reverse
Intuition
A palindrome is a word, phrase, or sequence that reads the same backwards as forwards. e.g. madam
A palindrome, and its reverse, are identical to each other.
Algorithm
We'll reverse the given string and compare it with the original. If those are equivalent, it's a palindrome.
Since only alphanumeric characters are considered, we'll filter out all other types of characters before we apply our algorithm.
Additionally, because we're treating letters as case-insensitive, we'll convert the remaining letters to lower case. The digits will be left the same.
     */

    public static void main(String[] args) {
        String isThisStringPalindrome = "3teNeT3";
        System.out.println(isPalindrome(isThisStringPalindrome));

    }
    static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

}
