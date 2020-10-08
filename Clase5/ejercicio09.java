package Clase5;

import java.util.Scanner;

public class ejercicio09 {

    public static void main(String[] args) {
        
        /*9. Desarrollar un programa que pida una cantidad de artículos 
        comprados y el precio unitario de ese artículo. Por cada carga 
        debe preguntar si se desea seguir ingresando de la forma “¿Desea 
        ingresar otro artículo? [S/N]”. La carga de datos finaliza cuando 
        se detecta una n o N. La computadora debe mostrar el monto de la factura.*/
        
        Scanner entrada = new Scanner(System.in);
        
        float precio, montoTotal = 0;
        boolean continuar = true;
        String opcion;
        
        int i = 0;
        while(continuar){
            
            System.out.println("\nArticulo " + (i+1));
            
            System.out.print("Ingrese el precio del articulo: ");
            precio = entrada.nextFloat();
            
            montoTotal += precio;
            
            System.out.print("\nDesea ingresar otro articulo? [S/N]: ");
            entrada.nextLine();//Limpio el buffer
            opcion = entrada.nextLine(); 
            
            if(opcion.equalsIgnoreCase("n")){
                continuar = false;
            }   
            
            i++;
        }
            
        System.out.print("\nEl monto total de la factura es de: " + montoTotal);
    }
    
}
