package clase3;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        
        /*Escriba un programa que determine si un número ingresado es positivo,
        negativo o cero.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();
        
        if(numero == 0){
            System.out.println("\nEl numero es cero");
        }
        else if (numero > 0){
            System.out.println("\nEl numero es positivo");
        }
        else{
            System.out.println("\nEl numero es negativo");
        } 
    }   
}
