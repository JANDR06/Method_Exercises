package exercises;

import java.util.Scanner;

/*
4. Create a function that receives a phrase, a word to replace, and the word that is
going to replace the previous one. The function must return the phrase modified.
For the resolution of the exercise, you can only use the charAt() and length()
functions of the String class

Enter a phrase:
Luis, me oyes? Luis!, luis!. Estas sordo luis!!!
Enter a word:
Luis
Enter a Word:
Carlos
Resultado:
Carlos, me oyes? Carlos!, Carlos!. Estas sordo Carlos!!!
 */

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        System.out.println();

        System.out.print("Escribe una palabra: ");
        String palabraVieja = sc.nextLine();

        System.out.println();

        System.out.print("Escribe una palabra: ");
        String palabraNueva = sc.nextLine();

        System.out.println();

        System.out.println("Resultado:");
        System.out.println(cambioFrase(frase, palabraVieja, palabraNueva));
    }

    public static String cambioFrase(String frase, String x, String y) {

        String nuevaFrase = "";
        x = x.toLowerCase();
        y = y.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {



        }


        return nuevaFrase;
    }
}
