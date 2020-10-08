package clase3;

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Escribir un programa que dada una nota del 1 al 10 diga
        Aplazado 1 al 3
        Regular 4-5
        Bueno 6-7
        Muy Bueno 8 y 9
        Sobresaliente 10*/
        
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();
        
        if(numero >= 1 && numero < 4){
            System.out.println("\nAplazado");
        }
        else if(numero >= 4 && numero < 6){
            System.out.println("\nRegular");
        }
        else if(numero >= 6 && numero < 8){
            System.out.println("\nBueno");
        }
        else if(numero >= 8 && numero < 10){
            System.out.println("\nMuy Bueno");               
        }
        else{
            System.out.println("\nSobresaliente");
        }      
    } 
}
