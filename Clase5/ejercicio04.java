package Clase5;

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        
        /*4. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 35000*/
        
        Scanner entrada = new Scanner(System.in);
        
        int sueldo, suma = 0, sueldosMayores = 0;
        
        int i = 0;
        while(i < 10){
            
            System.out.print("Ingrese el sueldo: ");
            sueldo = entrada.nextInt();
            
            if(sueldo > 35000){
                sueldosMayores++;
            }
            
            suma += sueldo;
            i++;
        }
        
        System.out.println("\nLa suma de todos los 10 sueldos es: " + suma);
        System.out.println("Los sueldos mayores de 35000 son: " + sueldosMayores);
    }   
}
