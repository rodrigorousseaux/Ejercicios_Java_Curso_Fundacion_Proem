package Clase6;

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in);
        
        String palabra;
        int palindromo = 0;
        
        /*
        Ejemplos:
         RADAR
         ANILINA
         NEUQUEN
        */
        
        System.out.print("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        
        for(int i = 0; i < (palabra.length() / 2); i++){
            
            if(palabra.charAt(i) == palabra.charAt((palabra.length() - i - 1))){
                palindromo++;
            }  
        }
        
        if(palindromo == palabra.length() / 2){
            System.out.println("Es palindromo");
        }
        else{
            System.out.println("No es palindromo");
        }      
    }   
}
