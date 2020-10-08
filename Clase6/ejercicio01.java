package Clase6;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        
        /*1) Realizar un programa donde se ingresan dos palabras e indicar cual tiene
        menos caracteres.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String palabra1, palabra2;
        
        System.out.print("Ingrese la primera palabra: ");
        palabra1 = entrada.nextLine();
        
        System.out.print("Ingrese la segunda palabra: ");
        palabra2 = entrada.nextLine();
        
        if(palabra1.length() < palabra2.length()){
            System.out.println(palabra1 + " tiene menos caracteres que " + palabra2);
        }
        else{
            System.out.println(palabra2 + " tiene menos caracteres que " + palabra1);
        }     
    }   
}
