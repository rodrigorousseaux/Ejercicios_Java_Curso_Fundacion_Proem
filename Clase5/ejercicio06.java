package Clase5;

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        
        /*6. Dadas las edades y alturas de 5 alumnos, mostrar la edad y 
        la estatura media, la cantidad de alumnos mayores de 18 años, y 
        la cantidad de alumnos que miden más de 1.75.*/
        
        Scanner entrada = new Scanner(System.in);
        
        int edad, cantMayores18 = 0, cantMasAltos = 0;
        float altura, alturaParcial = 0, promedioEstatura, edadParcial = 0, promedioEdad;
        
        for(int i = 0; i < 5; i++){
            
            System.out.println("\n[Alumno " + (i+1) + "]");
            
            System.out.print("Ingrese la edad: ");
            edad = entrada.nextInt();
            
            System.out.print("Ingrese la estatura: ");
            altura = entrada.nextFloat();
            
            edadParcial += edad;
            alturaParcial += altura;
            
            if(edad > 18){
                cantMayores18++;
            }
            
            if(altura > 1.75){
                cantMasAltos++;
            }
        }   
        
        promedioEdad = edadParcial / 5;
        promedioEstatura = alturaParcial / 5;
        
        System.out.println("\nEl promedio de edad es: " + promedioEdad);
        System.out.println("El promedio de estatura es: " + promedioEstatura);
        System.out.println("La cantidad de alumnos mayores de 18 es de: " + cantMayores18);
        System.out.println("La cantidad de alumnos que miden mas de 1,75 es de: " + cantMasAltos);    
    }  
}
