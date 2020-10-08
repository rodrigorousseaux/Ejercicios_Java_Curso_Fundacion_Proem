package Clase5;

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {
        
        /*5. Realizar un programa que solicite los valores mínimo y máximo de 
        un rango. A continuación solicitará por teclado un número que debe estar 
        dentro del rango. Si el valor introducido no pertenece al rango , la 
        aplicación volverá a pedir otro valor y así repetida veces hasta que 
        el valor este dentro del rango.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int inicio, fin, numero;
        
        System.out.print("Ingrese el inicio del rango: ");
        inicio = entrada.nextInt();
        
        System.out.print("Ingrese el final del rango: ");
        fin = entrada.nextInt();
        
        System.out.print("\nIngrese un número: ");
        numero = entrada.nextInt();
        
        while(numero < inicio || numero > fin){
            
            System.out.println("\nEl número no se encuentra dentro del rango. Ingrese otro número: ");
            numero = entrada.nextInt();
        }
        
        System.out.println("\nEl numero " + numero + " se encuentra dentro del rango!");
        
    }
    
}
