package ejercicios;

// ? Importamos la clase Scanner, Locale
import java.util.Scanner;
import java.util.Locale;

// ? Programa que dado los valores radio y altura calcule el área y el volumen de un cilindro según la opción elegida.
public class Ejercicio3 {
    // ? Definimos la función cilindro la cual tiene los parámetros radio, altura y opción
    static void cilindro(double radio, double altura, byte opcion){ 
        switch (opcion){
            case 0:
                System.out.println("Fin del Programa");
                break;
            case 1:
                System.out.println("El área del cilindro es: " + (2 * Math.PI * radio * (altura + radio)));
                break;
            case 2:
                System.out.println("El volumen del cilindro es: " + (Math.PI * Math.pow(radio, 2) * altura));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    } public static void main(String[] args) {
        // ? En el método main definimos la recogida de datos y la llamada a la función cilindro
        // ^ Definimos las variables radio, altura y opcion
        double radio, altura;
        byte opcion;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new java.util.Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos al usuario el funcionamiento del programa
        System.out.println("Este programa calcula el área y el volumen de un cilindro.");

        // ! Pedimos a el usuario tanto el radio como la altura
        System.out.print("Introduce el valor del radio: ");
        radio = read.nextDouble(); // * Leemos el radio
        System.out.print("Introduce el valor de la altura: ");
        altura = read.nextDouble(); // * Leemos la altura

        do{
            // ? Salto de Línea Triple
            System.out.println("\n-----------------------------------------\n");

            // ! Pedimos al usuario que elija una opción
            System.out.println("Elige una opción:");
            System.out.println("0. Salir");
            System.out.println("1. Calcular el área");
            System.out.println("2. Calcular el volumen");
            System.out.print("> ");
            opcion = read.nextByte(); // * Leemos la opción que escoja el usuario
            
            // ? Salto de Línea Triple
            System.out.println("\n-----------------------------------------\n");

            // ! Llamamos a la función cilindro
            cilindro(radio, altura, opcion);
        } while (opcion != 0);

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // € Hecho por Antonio Navarro
    }
}
