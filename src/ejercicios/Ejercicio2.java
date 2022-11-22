package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    static void between(long num1, long num2) { // ! Definimos la función between la cual tiene los parámetros num1 y num2
        for (num1++; num1 < num2; num1++){ // * Creamos un bucle for que se repita desde el número siguiente al introducido hasta el número anterior al introducido
            System.out.print(num1 + ", "); // * Imprimimos el número seguido de una coma y un espacio
        }
    }

    public static void main(String[] args) {
        // ^ Definimos las variables num1 y num2
        long num1, num2;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new java.util.Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos al usuario el funcionamiento del programa
        System.out.println("Este programa imprime todos los números entre dos números introducidos por teclado.");

        // ! Pedimos a el usuario tanto el número 1 como el número 2
        System.out.print("Introduce el valor del número 1: ");
        num1 = read.nextLong(); // * Leemos el primer número
        System.out.print("Introduce el valor del número 2: ");
        num2 = read.nextLong(); // * Leemos el segundo número

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-----------------------------------------\n");

        // ! Llamamos a la función between
        between(num1, num2);

        // € Hocho por Antonio Navarro
    }
}
