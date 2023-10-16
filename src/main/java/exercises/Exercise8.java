package exercises;

import java.util.Scanner;

/*
8. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de
ellos es el más elevado. Impleméntalo creando únicamente una función a la que
le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
 */

public class Exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Escribe un valor: ");
        int valor2 = sc.nextInt();
        System.out.print("Escribe un valor: ");
        int valor3 = sc.nextInt();

        System.out.println();

        if (valor1 > valor2) {
            System.out.println("El valor maximo es " + valorAlto(valor1, valor3));

        } else if (valor1 > valor3) {
            System.out.println("El valor maximo es " + valorAlto(valor1, valor2));

        } else {
            System.out.println("El valor maximo es " + valorAlto(valor2, valor3));
        }
    }

    public static int valorAlto(int x, int y) {
        int max;

        if (x > y) {
            max = x;

        } else {
            max = y;
        }

        return max;
    }
}
