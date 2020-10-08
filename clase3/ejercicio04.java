package clase3;

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        
        /*Escribir un programa que pida 3 números y los ordene de mayor a
        menor.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, numero3;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        numero3 = entrada.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El mayor es el " + numero1);
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El mayor es el " + numero2);
        }
        else{
            System.out.println("El mayor es el " + numero3);
        }
        
    }
    
}
