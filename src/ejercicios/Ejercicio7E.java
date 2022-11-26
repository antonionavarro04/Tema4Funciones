package ejercicios;

public class Ejercicio7E {
    public static void main(String[] args) {
        // ^ Definimos la variable num
        int num = 100000000;

        // ! Imprimimos el mensaje y dentro llamamos a la función divisoresPrimos]#
        System.out.println("El número " + num + " tiene " + Methods.divisoresPrimos(num) + " divisores primos.");
    }
}
