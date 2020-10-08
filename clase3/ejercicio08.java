package clase3;

import java.util.Scanner;

public class ejercicio08 {

    public static void main(String[] args) {
        
        /*Escribir un programa que muestre el día de la semana. Ejemplo si
        ingreso 1 que me diga que es lunes,2 martes ,etc.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();
        System.out.println("");
        
        if(numero == 1){
            System.out.println("Lunes");
        }
        else if(numero == 2){
            System.out.println("Martes");
        }
        else if(numero == 3){
            System.out.println("Miercoles");
        }
        else if(numero == 4){
            System.out.println("Jueves");
        }
        else if(numero == 5){
            System.out.println("Viernes");
        }
        else if(numero == 6){
            System.out.println("Sabado");
        }
        else if(numero == 7){
            System.out.println("Domingo");
        }
        else{
            System.out.println("El dia no existe");
        }
        
    }
}
