package Clase5;

import java.util.Scanner;

public class ejercicio08 {

    public static void main(String[] args) {
        
        /*8. Desarrollar un programa que pida un carácter al usuario y que por 
        cada carga pregunte si se desea seguir ingresando. De la forma 
        “¿Desea ingresar otro carácter? [S/N]”. La carga de datos finaliza 
        cuando se detecta una n o N. La computadora debe mostrar la cantidad 
        de letras vocales ingresadas. (Debe admitir mayúsculas y minúsculas).*/
        
        Scanner entrada = new Scanner(System.in);
        
        String letra, opcion;
        int cantVocales = 0;
        boolean continuar = true;
  
        while(continuar){
            
            System.out.print("\nIngrese un caracter: ");
            letra = entrada.nextLine();
            
            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") 
                    || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                cantVocales++;
            }
            
            System.out.print("\nDesea ingresar otro caracter? [S/N]: ");
            opcion = entrada.nextLine(); 
            
            if(opcion.equalsIgnoreCase("n")){
                continuar = false;
            }
        }
        
        System.out.println("\nLa cantidad de vocales ingresadas es de: "+ cantVocales);
    }   
}
