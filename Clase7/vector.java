package Clase7;

import java.util.Scanner;

public class vector {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int NUM = 4;
        int numeros[] = new int[NUM];
        int total = 1;
        
        for (int i = 0; i < NUM; i++) {
            
            System.out.print((i+1)+ "- Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
            
        }
        
        System.out.println("\nLos elementos son");
        for (int i = 0; i < NUM; i++) {
            
            System.out.println(numeros[i]);
            total *= numeros[i];
            
        }
        
        System.out.println("\nEl producto de los elementos es: " + total);
        
    }
    
}
