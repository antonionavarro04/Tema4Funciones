package ejercicios;

public class Methods {
    static void eco (long veces) { // ! Definimos la función veces la cual tiene el parámetro veces
        for (int i = 1; i <= veces; i++){ // * Creamos un bucle for que se repita el número de veces que se le indique en el método main
            System.out.println("[" + i + "] > Eco..."); // * Imprimimos el mensaje
        }
    }

    static void between (long num1, long num2) { // ! Definimos la función between la cual tiene los parámetros num1 y num2
        for (num1++; num1 < num2; num1++){ // * Creamos un bucle for que se repita desde el número siguiente al introducido hasta el número anterior al introducido
            System.out.print(num1 + ", "); // * Imprimimos el número seguido de una coma y un espacio
        }
    }

    static void cilindro (double radio, double altura, byte opcion){ 
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
    }
}
