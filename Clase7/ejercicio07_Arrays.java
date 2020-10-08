package Clase7;

import java.util.Scanner;

public class ejercicio07_Arrays {

    public static void main(String[] args) {
        
        /*Diseñar un programa que permita cargar las notas de cada uno de los 
        5 alumnos de un curso. Cada alumno tiene 3 notas donde las notas de un 
        alumno corresponden a una fila de una matriz. Elaborar un algoritmo 
        que calcule e imprima el promedio de cada alumno.*/
        
        Scanner entrada = new Scanner(System.in);
        
        final int cantAlumnos = 5;
        final int cantNotas = 3;
        
        int nota, suma = 0;
        float promedio;
        int[][] notasAlumnos = new int[cantAlumnos][cantNotas];
        
        for(int i = 0; i < cantAlumnos; i++){
            
            suma = 0;
            
            System.out.println("\n[Alumno " + (i + 1) + "]");
            
            for(int j = 0; j < cantNotas; j++){
                
                System.out.print("Ingrese nota " + (j + 1) + ": ");
                notasAlumnos[i][j] = entrada.nextInt();
                
                suma += notasAlumnos[i][j];
            }
            
            promedio = (float)suma / cantNotas;
            System.out.println("\nPromedio: " + promedio);
        }       
    }
}
