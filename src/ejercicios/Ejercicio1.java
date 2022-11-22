package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    static void eco(long veces) { // ! Definimos la función veces la cual tiene el parámetro veces
        for (int i = 1; i <= veces; i++){ // * Creamos un bucle for que se repita el número de veces que se le indique en el método main
            System.out.println("[" + i + "] > Eco..."); // * Imprimimos el mensaje
        }
    }
    public static void main(String[] args) {
        // ? Diseña la función eco la cual imprime el mensaje "Eco..." tantas veces como se le indique.
        // ^ Definimos la variable veces
        long veces;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new java.util.Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el número de veces a ejecutar el código
        System.out.print("¿Cuántas veces quieres que se repita el código? ");
        veces = read.nextLong();

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-------------\n");

        // ! Llamamos a la función eco
        eco(veces);

        // € Hecho por Antonio Navarro
    }
}
