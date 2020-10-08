package Clase5;

import java.util.Scanner;

public class centinelaBandera {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        boolean continuar = true;
        float total = 0, sueldo;
        
        int i = 0;        
        while(i < 12 && continuar == true){
            
            System.out.print("Mes " + (i+1) + " - Ingrese el sueldo o un numero negativo para terminar:   ");
            sueldo = entrada.nextFloat();
            
            if(sueldo >= 0){
               total += sueldo;
               i++;
            }
            else{
                continuar = false;
            }    
        }
        
        System.out.println("\nEl sueldo anual es: $" + total);     
    }  
}
