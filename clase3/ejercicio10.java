package clase3;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        /*Escribir un programa que al ingresar un numero entero indique cuantas
        cifras de 0 al 99.999*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, contador = 0;
        
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();
        
        if(numero >= 0 && numero < 10){
            System.out.println("\nEl numero tiene 1 cifra");
        }
        else if(numero >= 10 && numero < 100){
            System.out.println("\nEl numero tiene 2 cifras");
        }
        else if(numero >= 100 && numero < 1000){
            System.out.println("\nEl numero tiene 3 cifras");
        }
        else if(numero >= 1000 && numero < 10000){
            System.out.println("\nEl numero tiene 4 cifras");
        }
        else if(numero >= 10000 && numero < 100000){
            System.out.println("\nEl numero tiene 5 cifras");
        }    
    }  
}
