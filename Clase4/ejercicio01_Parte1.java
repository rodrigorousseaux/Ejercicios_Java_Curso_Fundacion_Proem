package Clase4;

import java.util.Scanner;

public class ejercicio01_Parte1 {

    public static void main(String[] args) {
              
        /*Ejercicio 8 - Clase 3
        Escribir un programa que muestre el día de la semana. Ejemplo si
        ingreso 1 que me diga que es lunes,2 martes ,etc.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();
        
        switch(numero){
            
            case 1: System.out.println("\nLunes");
            break;
            
            case 2: System.out.println("\nMartes");
            break;
            
            case 3: System.out.println("\nMiercoles");
            break;
            
            case 4: System.out.println("\nJueves");
            break;
            
            case 5: System.out.println("\nViernes");
            break;
            
            case 6: System.out.println("\nSábado");
            break;
            
            case 7: System.out.println("\nDomingo");
            break;
            
            default: System.out.println("\nNo existe ese día. Ingrese un numero del 1 al 7");
            break;    
        }   
    }   
}
