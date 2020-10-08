package clase3;

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        
        /*Escriba un programa que permita ingresar valores numéricos 
        A, B, C, D, E y decir si su promedio es mayor que o igual a 10.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, numero3, numero4, numero5;
        float promedio;
        
        System.out.print("Ingrese A: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese B: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Ingrese C: ");
        numero3 = entrada.nextInt();
        
        System.out.print("Ingrese D: ");
        numero4 = entrada.nextInt();
        
        System.out.print("Ingrese E: ");
        numero5 = entrada.nextInt();
        
        promedio = (float)(numero1 + numero2 + numero3 + numero4 + numero5) / 5;
        
        if(promedio == 10){
            
            System.out.println("\nEl promedio es igual a diez");
        }
        else if(promedio > 10){
            System.out.println("\nEl promedio es mayor a diez");      
        }      
    }    
}
