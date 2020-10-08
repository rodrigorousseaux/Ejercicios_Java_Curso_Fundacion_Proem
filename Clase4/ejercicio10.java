package Clase4;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        /*10.Se ingresan 5 números. La computadora muestra cuál fue el mayor y en
        qué orden apareció.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, mayor = 0, posicion = 0;
        
        for(int i = 0; i < 5; i++){
            
            System.out.print("[" + (i+1) + "] - Ingrese un numero: ");
            numero = entrada.nextInt();
            
            if(numero > mayor){
                mayor = numero;
                posicion = i+1;
            }      
        }
        
        System.out.println("\nEl número mayor es el " + mayor 
                + " y se encontró en la posición " + posicion);
        
    }
    
}
