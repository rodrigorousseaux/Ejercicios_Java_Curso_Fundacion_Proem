package Clase5;

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String[] args) {
        
        /*7. Una cuenta bancaria tiene 30000 pesos de saldo. El usuario 
        ingresará valores que corresponden a extracciones vía cajero 
        automático. Por cada extracción se debe mostrar como quedó el saldo 
        luego de la operación. Una extracción que supere al saldo disponible 
        se debe rechazar indicando que no es posible la operación. El programa 
        finaliza cuando el saldo queda en cero.*/
        
        Scanner entrada = new Scanner(System.in);
        
        float cuenta = 30000;
        float extraccion;
        boolean continuar = true;
        
        while(continuar){
            
            System.out.println("\n\tEXTRACCION DE DINERO");
            System.out.println("\nSaldo Actual: " + cuenta);
            
            System.out.print("¿Cuanto dinero desea extraer?: ");
            extraccion = entrada.nextFloat();
            
            if(extraccion > cuenta){
                System.out.println("\nNo tiene saldo suficiente");
            }
            else{
               cuenta -= extraccion;
               System.out.println("\nEXTRACCION REALIZADA!");
               System.out.println("Saldo Actual: " + cuenta);
            }
            
            if(cuenta == 0){
                continuar = false;
            }     
        }   
        
        System.out.println("\nHasta Luego!");
    }
}
