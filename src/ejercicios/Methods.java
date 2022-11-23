package ejercicios;

public class Methods {
    public void cilindro(double radio, double altura, byte opcion){ 
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
