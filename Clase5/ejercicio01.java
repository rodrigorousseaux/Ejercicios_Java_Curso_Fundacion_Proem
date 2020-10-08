package Clase5;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        
        /*1. Leer un número e indicar si es positivo o negativo. 
        El proceso se repetirá hasta que se introduzca un 0.*/
        
        Scanner entrada = new Scanner(System.in);
       
        int numero, centinela = 0;
        
        System.out.print("Ingrese un número (cero para salir): ");
        numero = entrada.nextInt();
        
        int i = 0;
        while(numero != centinela){
            
            if(numero > 0){
                System.out.println("El número es positivo");
            }
            else if(numero < 0){
                System.out.println("El número es negativo");   
            }
            
            System.out.print("\nIngrese un número (cero para salir): ");
            numero = entrada.nextInt();         
        }     
    }  
}
