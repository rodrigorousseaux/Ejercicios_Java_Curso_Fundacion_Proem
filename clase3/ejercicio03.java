package clase3;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        
        /*Escriba un programa que permita leer dos valores numéricos A y B. 
        Si A es mayor que B debe realizar la suma de ambos, caso contrario, 
        se hace el producto.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, suma, producto;
        
        System.out.print("Ingrese A: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese B: ");
        numero2 = entrada.nextInt();
        
        if(numero1 > numero2){
            suma = numero1 + numero2;
            System.out.println("\nLa suma de los números es: " + suma);
        }
        else{
            producto = numero1 * numero2;
            System.out.println("\nEl producto de los números es: " + producto);
        }
        
    }
    
}
