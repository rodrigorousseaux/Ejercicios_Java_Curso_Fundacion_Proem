package Clase4;

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String[] args) {
        
        /*7. Diseñar un algoritmo que realice el promedio de 4 números. Los
        números podrán ser decimales y serán ingresados por pantalla por el
        usuario.*/
        
        Scanner entrada = new Scanner(System.in);
        
        double numero, suma = 0, contador = 0, promedio;
        
        for(int i = 0; i < 4; i++){
            
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            numero = entrada.nextDouble();
            
            suma += numero;
            contador++;
        }
        
        promedio = suma / contador;
        
        System.out.println("\nEl promedio es: " + promedio);
    }
    
}
