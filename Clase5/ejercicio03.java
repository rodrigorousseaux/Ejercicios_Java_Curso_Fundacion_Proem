package Clase5;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        
        /*3. Pedir números hasta que se teclee un 0, 
        mostrar la suma de todos los números introducidos.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, suma = 0;
        boolean continuar = true;
        
        while(continuar){
            
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            
            if(numero != 0){
               suma += numero; 
            }
            else{
                continuar = false;
            }
        }
        
        System.out.println("\nLa suma de todos los numeros es: " + suma);
        
    }
    
}
