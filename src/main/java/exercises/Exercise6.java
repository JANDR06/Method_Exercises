package exercises;

import java.util.Scanner;

/*
6. Escribe un programa que pida un número entero por teclado y muestre por
pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */

public class Exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero por teclado: ");
        int numero = sc.nextInt();

        if (dimeSigno(numero) == -1) {
            System.out.println("El numero es negativo");

        } else if (dimeSigno(numero) == 0) {
            System.out.println("El numero es igual a cero");

        } else {
            System.out.println("El numero es positivo");
        }
    }

    public static int dimeSigno(int a) {
        int x;

        if (a < 0) {
            x = -1;

        } else if (a == 0) {
            x = 0;

        } else {
            x = 1;
        }

        return x;
    }
}
