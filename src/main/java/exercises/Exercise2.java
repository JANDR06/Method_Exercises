package exercises;

import java.util.Scanner;

/*
2. Create a function that, from a number, creates the identity matrix.

Enter a number: 5
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5
 */

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();

        System.out.println();

        System.out.println("Resultado: ");
        matrizNumber(numero);
    }

    public static void matrizNumber(int tamanyo) {

        for (int i = 1; i <= tamanyo; i++) {
            for (int j = 1; j <= tamanyo; j++) {

                if (i == j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
