package clase3;

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {
        
        /*Escribir un programa que al ingresar un numero diga si este es 
        par, impar o nulo.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();
        
        if(numero == 0){
            System.out.println("\nEl número es nulo");
        }
        else if(numero % 2 == 0){
            System.out.println("\nEl número es par");
        }
        else{
            System.out.println("\nEl número es impar");
        }    
    }  
}
