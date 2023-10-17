package exercises;

import java.util.Scanner;

/*
1. Create a program that prompts for a phrase and shows whether it is a palindrome.
Blank spaces should not be taken into consideration.

Enter a phrase
hol a aloh
The phrase is a palindrome.
 */

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        System.out.println();

        if (palindrome(frase)) {
            System.out.println("La frase es palindrome");

        } else {
            System.out.println("La frase no es palindrome");
        }
    }

    public static boolean palindrome (String frase) {
        boolean esPalindrome = true;
        String aux = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
                aux += frase.charAt(i);
        }

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == aux.charAt(i)) {
                esPalindrome = true;
            } else {
                esPalindrome = false;
            }
        }

        return esPalindrome;
    }
}
