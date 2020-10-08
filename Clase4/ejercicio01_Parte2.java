package Clase4;

import java.util.Scanner;

public class ejercicio01_Parte2 {

    public static void main(String[] args) {
        
        /*Ejercicio 9 - Clase 3
        Escribir un programa que cuando el usuario ingrese el mes, me diga
        cuantos días tiene.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String mes;
        
        System.out.print("Ingrese un mes: ");
        mes = entrada.nextLine();
        
        switch(mes){
            
            case "enero": System.out.println("\n31 días");
            break;
            
            case "febrero": System.out.println("\n28 días");
            break;
            
            case "marzo": System.out.println("\n31 días");
            break;
            
            case "abril": System.out.println("\n30 días");
            break;
            
            case "mayo": System.out.println("\n31 días");
            break;
            
            case "junio": System.out.println("\n30 días");
            break;
            
            case "julio": System.out.println("\n31 días");
            break;
            
            case "agosto": System.out.println("\n31 días");
            break;
            
            case "septiembre": System.out.println("\n30 días");
            break;
            
            case "octubre": System.out.println("\n31 días");
            break;
            
            case "noviembre": System.out.println("\n30 días");
            break;
            
            case "diciembre": System.out.println("\n31 días");
            
            default: System.out.println("\nNo existe ese mes");
            break;    
        }          
        
    }
    
}
