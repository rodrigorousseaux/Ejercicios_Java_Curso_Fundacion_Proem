
package Clase4;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        
        /*Escribir un programa que simule una calculadora básica que realice
        operaciones de suma, resta, multiplicación y división. Se deben recibir
        como entrada dos números reales y un operador, que puede ser +, -, * ó /. 
        La salida del programa debe ser el resultado de la operación.*/
        
        Scanner entrada = new Scanner(System.in);
       
        float num1, num2, resultado;
        char opcion;
          
        System.out.print("\n\tCALCULADORA BASICA");
        System.out.print("\nSuma (Ingrese '+'): ");
        System.out.print("\nResta (Ingrese '-'): ");
        System.out.print("\nProducto (Ingrese '*'): ");
        System.out.print("\nDivisión (Ingrese '/'): ");
        System.out.print("\nIngrese una opción: ");
        opcion = entrada.nextLine().charAt(0);
            
        switch(opcion){
            case '+': 
                System.out.print("\nIngrese el primer numero: ");
                num1 = entrada.nextFloat();
                          
                System.out.print("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                  
                resultado = num1 + num2;
                System.out.println("\nEl resultado de la suma es: " + resultado);
            break;
            
            case '-': 
                System.out.print("\nIngrese el primer numero: ");
                num1 = entrada.nextFloat();
                          
                System.out.print("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                  
                resultado = num1 - num2;
                System.out.println("\nEl resultado de la resta es: " + resultado);
            break;
            
            case '*': 
                System.out.print("\nIngrese el primer numero: ");
                num1 = entrada.nextFloat();
                          
                System.out.print("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                  
                resultado = num1 * num2;
                System.out.println("\nEl resultado de la multiplicación es: " + resultado);
            break;
            
            case '/': 
                System.out.print("\nIngrese el primer numero: ");
                num1 = entrada.nextFloat();
                          
                System.out.print("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                  
                resultado = num1 / num2;
                System.out.println("\nEl resultado de la división es: " + resultado);
            break;                      
        }   
    } 
}
