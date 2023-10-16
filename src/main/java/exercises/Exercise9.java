package exercises;

import java.util.Scanner;

/*
9. Escribe una función que muestre por pantalla un triángulo como el del ejemplo.
Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de
líneas del triángulo.

   a
  aaa
 aaaaa
aaaaaaa
 */

public class Exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu caracter favorito: ");
        char caracter = sc.next().charAt(0);

        System.out.print("Escribe tu numero favorito: ");
        int numero = sc.nextInt();

        System.out.println();

        System.out.println("Resultado:");
        trianguloCaracter(caracter, numero);

    }

    public static void trianguloCaracter (char c, int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j >= 1 ; j--) {
                System.out.print("  ");
            }


            for (int j = 1; j <= i + (i - 1); j++) {

                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
