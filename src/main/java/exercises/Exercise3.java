package exercises;

import java.util.Scanner;

/*
3. Create a function for asking for a phrase, and two integer numbers (upper limit and
lower limit). This function must return a substring between the two integers. If you
enter a number less than 0 in the lower limit, it will be equal to zero. In case the top
number is greater than the length of the String minus one, it must be equal to this
length. In case the lower index was greater than the upper one, it should return an
empty string. You can only use the charAt() and length() functions of the String
class.

Enter a phrase:
Hola como estas
Enter a lower limit:
2
Enter a upper limit:
11
The substring is: la como es
 */

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        System.out.println();

        System.out.print("Escribe un limite izquierdo: ");
        int limiteIzq = sc.nextInt();

        System.out.println();

        System.out.print("Escribe un limite derecho: ");
        int limiteDer = sc.nextInt();

        System.out.println();

        if (limiteDer < limiteIzq) {
            return ;
        }

        System.out.println("La nueva frase es: " + nuevoString(frase,limiteDer, limiteIzq));
    }

    public static String nuevoString(String frase, int limiteDer, int limiteIzq) {

        String substring = "";

        for (int i = limiteIzq; i <= limiteDer; i++) {
            substring += frase.charAt(i);
        }

        return substring;
    }
}
