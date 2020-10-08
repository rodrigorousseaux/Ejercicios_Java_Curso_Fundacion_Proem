package Clase6;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        
        /*2) Realizar un programa que pida el nombre y apellido al usuario. El programa
        debe eliminar cualquier vocal del nombre sean en minúsculas o mayúsculas. El
        resto de caracteres no se modifican.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        
        System.out.print("Ingrese su nombre y apellido: ");
        nombre = entrada.nextLine();
        
        System.out.println("");

        for (int i = 0; i < nombre.length(); i++) {
            
            if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'A' || nombre.charAt(i) == 'e' ||  nombre.charAt(i) == 'E' 
                   || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'I' || nombre.charAt(i) == 'o' || nombre.charAt(i) == 'O' 
                   || nombre.charAt(i) == 'u'){
                System.out.print("");   
            }           
            else{
                System.out.print(nombre.charAt(i));
            }
        }     
    }  
}
