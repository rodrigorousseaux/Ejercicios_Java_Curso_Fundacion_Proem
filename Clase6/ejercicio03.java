package Clase6;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        
        /*3) Leer una frase y encontrar la palabra de mayor longitud*/
        
        Scanner entrada = new Scanner(System.in);

        String frase, palabraMayor = "";
        int palabraTamañoMayor = 0;
        String  palabraGuardada = "";
       
        System.out.print("Ingrese frase: ");
        frase = entrada.nextLine();
    
        // (\\s") quiere decir sin espacios en blanco y split se usa para separar la frase en palabras
        String[] palabraSeparada = frase.split("\\s");
             
        for (int i = 0; i < palabraSeparada.length; i++){
          
            palabraGuardada = palabraSeparada[i];
            
            if (palabraGuardada.length() > palabraTamañoMayor){    	       
                palabraMayor = palabraGuardada;
                palabraTamañoMayor = palabraGuardada.length();
            }
        }  

        System.out.println("\nLa palabra de mayor longitud es: " + palabraMayor);   
    }
    
}
