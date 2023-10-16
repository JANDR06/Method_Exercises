package exercises;

import java.util.Scanner;

/*
7. Escribe un programa que pida un valor entero en millas y muestre su equivalente
en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a
kilómetros

 */

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un valor entero de millas: ");
        int millas = sc.nextInt();
        System.out.println("La conversion de millas a kilometros es: " + millas_a_kilometros(millas) + " kilometros");
    }

    public static double millas_a_kilometros(int millas) {
        double km = millas * 1.60934;
        return km;
    }
}
