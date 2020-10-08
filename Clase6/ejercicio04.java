package Clase6;

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        
        /*4) Sustituir todos los espacios en blanco de una frase por asteriscos*/
        
        Scanner entrada = new Scanner(System.in);
        
        String frase;
        
        System.out.print("Frase: ");
        frase = entrada.nextLine();
        
        System.out.println("");

        System.out.println("\nCadena: " + frase.replace(' ', '*'));   
    }
    
}
