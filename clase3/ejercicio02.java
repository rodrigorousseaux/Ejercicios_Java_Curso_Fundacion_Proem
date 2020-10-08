package clase3;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        
        /*Escribir un programa que sea capaz de encontrar el máximo de dos
        valores (M y N).*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        
        if(numero1 > numero2){
            System.out.println("\nEl mayor es el " + numero1);
        }
        else if(numero2 > numero1){
            System.out.println("\nEl mayor es el " + numero2);
        }
        else{
            System.out.println("\nLos números son iguales");
        }     
    }   
}
