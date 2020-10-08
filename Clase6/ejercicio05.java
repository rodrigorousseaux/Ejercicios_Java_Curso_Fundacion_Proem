package Clase6;

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {
        
        /*5) Escribe una aplicación con un String que contenga una contraseña
        cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos.
        Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje
        diciendo “Contraseña correcta”. Piensa bien en la condición de salida (3
        intentos y si acierta sale, aunque le queden intentos).*/
        
        Scanner entrada = new Scanner(System.in);
        
        final String contraseña = "123456";
        
        String usuarioContraseña = "";
        int intentos = 3;
        
        while(!usuarioContraseña.equals(contraseña) && intentos > 0){
            
            System.out.print("\nIngrese la contraseña, le quedan " + (intentos) + " intentos: ");
            usuarioContraseña = entrada.nextLine();
        
            intentos--;
            
            if(usuarioContraseña.equals(contraseña)){
                System.out.println("Contraseña correcta");
                break;
            }
            else{
                System.out.println("\nContraseña Incorrecta");
            }
        }    
    }   
}
