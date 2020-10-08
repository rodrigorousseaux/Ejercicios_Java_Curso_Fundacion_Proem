package clase3;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        
        /*11.Construir un programa que dado la categoría y el sueldo de un
        trabajador ,calcule el aumento correspondiente teniendo en cuenta la
        siguiente información
        Categoría 1: 15%
        Categoría 2: 10%
        Categoría 3: 8%
        Categoría 4: 5%*/
        
        Scanner entrada = new Scanner(System.in);
        
        int categoria;
        float sueldo, aumento;
        
        System.out.print("Ingrese la categoría del empleado: ");
        categoria = entrada.nextInt();
        
        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = entrada.nextFloat();
        
        switch(categoria){
            
            case 1: aumento = (sueldo * 15) / 100;
                    System.out.println("\nEl aumento del empleado es de $" + aumento);
            break;
            
            case 2: aumento = (sueldo * 10) / 100;
                    System.out.println("\nEl aumento del empleado es de $" + aumento);
            break;
            
            case 3: aumento = (sueldo * 8) / 100;
                    System.out.println("\nEl aumento del empleado es de $" + aumento);
            break;
            
            case 4: aumento = (sueldo * 5) / 100;
                    System.out.println("\nEl aumento del empleado es de $" + aumento);
            break;
            
            default: System.out.println("\nNo existe ese numero de categoría. Ingrese un numero del 1 al 4");
            break;
        }
   
    }   
}
