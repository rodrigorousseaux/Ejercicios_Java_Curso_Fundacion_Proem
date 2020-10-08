package Clase4;

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        
        /*6. Dado un entero N entre 1 y 10 (inclusive), la computadora 
        muestra la tabla de multiplicar de N.*/
        
        Scanner entrada = new Scanner(System.in);
       
        int numero, producto;       
        
        System.out.print("Ingrese un numero del 1 al 10(inclusive): ");
        numero = entrada.nextInt();
        
        System.out.println("");
        
        for(int i = 0; i < 10; i++){
            
            producto = numero * (i+1);
            System.out.println(numero + " * " + (i+1) + ": " + producto);
        }
        
    }
    
}
