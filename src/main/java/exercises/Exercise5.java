package exercises;

import java.util.Scanner;

/*
5. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
mayor de edad o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso
contrario
 */

public class Exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu edad por teclado: ");
        int edad = sc.nextInt();

        System.out.println();

        if (esMayorEdad(edad)) {
            System.out.println("¡ENHORABUENA! ERES MAYOR DE EDAD");

        } else {
            System.out.println("Una pena, eres menor");
        }
    }

    public static boolean esMayorEdad(int a) {
        return a >= 18;
    }
}
