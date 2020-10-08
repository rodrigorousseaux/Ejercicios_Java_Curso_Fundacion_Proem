package Clase5;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        
        /*2. Pedir números hasta que se teclee uno negativo, 
        y mostrar cuántos números se han introducido.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, cantNumeros = 0;
        boolean continuar = true;
        
        while(continuar){
            
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            
            if(numero > 0){
                cantNumeros++;
            }
            else{
                continuar = false;
            }           
        }
        
        System.out.println("\nSe han introducido " + cantNumeros + " números");
       
    }
    
}
