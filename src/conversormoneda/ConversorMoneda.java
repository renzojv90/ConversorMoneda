
package conversormoneda;

import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {
        EXTERNA:
        
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("====================================");
            System.out.println("""
                               1 - Pesos Argentinos Oficial a Dolar
                               2 - Pesos Mexicanos Oficial a Dolar
                               3 - Sol Peruano Oficial a Dolar
                               4 - Salir
                               """);
             System.out.println("====================================");
            System.out.println("");
            System.out.println("INGRESE UNA OPCIÓN: ");
            System.out.println("");
             System.out.println("====================================");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1' -> convertir(189.58, "Pesos Argentinos");
                case '2' -> convertir(22.5, "Pesos Mexicanos");
                case '3' -> convertir(3.58, "Soles Peruanos");
                case '4' -> {
                    System.out.println("Saliendo del programa");
                    break EXTERNA;
                }
                default -> System.out.println("OPCION INCORRECTA");
                
                }
            /*-------------Otra forma de hacerlo--------------
            switch(opcion){
                case '1': 
                    convertir(189.58, "Pesos Argentinos");
                    break;
                case '2':
                    convertir(22.5, "Pesos Mexicanos");
                    break;
                case '3': convertir(3.58, "Soles Peruanos");
                    break;
                case '4': System.out.println("Saliendo del programa");
                    break EXTERNA;
                default: System.out.println("OPCION INCORRECTA");
                    break;
                
                }
            */
            
        }
    }
    
    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s:", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double) Math.round(dolares * 100d)/100;
        
        System.out.println("======================================");
        System.out.println("Tienes $" + dolares + " Dolares");
        System.out.println("======================================");
        
    }
    
}
