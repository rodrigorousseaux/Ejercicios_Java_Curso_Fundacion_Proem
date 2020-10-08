package Clase5;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        /*10. En un colegio existe la posibilidad de elegir, en la materia 
        "lengua extranjera", entre las siguientes opciones: 
        [I]nglés 
        [F]rancés 
        [P]ortugués 
        [A]lemán. 
        Se ingresa, para cada alumno, la lengua elegida. La computadora 
        muestra el porcentaje de alumnos que eligió cada lengua, en forma de número*/
        
        Scanner entrada = new Scanner(System.in);
        
        int cantAlumnos, cantIngles = 0, cantFrances = 0, cantPortugues = 0, cantAleman = 0;
        String materia;
        float porcentajeIngles, porcentajeFrances, porcentajePortugues, porcentajeAleman;
        
        System.out.print("Cual es el total de alumnos?: ");
        cantAlumnos = entrada.nextInt();
        
        entrada.nextLine();//Limpio el buffer
        
        for(int i = 0; i < cantAlumnos; i++){
            
            System.out.println("\nAlumno " + (i+1));
           
            System.out.print("Ingrese la materia a la que se quiere inscribir [I/F/P/A]: ");
            
            materia = entrada.nextLine();
            
            if(materia.equalsIgnoreCase("i")){
                cantIngles++;
            }
            else if(materia.equalsIgnoreCase("f")){
                cantFrances++;
            }
            else if(materia.equalsIgnoreCase("p")){
                cantPortugues++;
            }
            else{
                cantAleman++;
            }   
        } 
        
        porcentajeIngles = (cantIngles * 100) / cantAlumnos;
        porcentajeFrances = (cantFrances * 100) / cantAlumnos;
        porcentajePortugues = (cantPortugues * 100) / cantAlumnos;
        porcentajeAleman = (cantAleman * 100) / cantAlumnos;
        
        System.out.println("\nPorcentaje Ingles: " + porcentajeIngles + "%");
        System.out.println("Porcentaje Frances: " + porcentajeFrances + "%");
        System.out.println("Porcentaje Portugues: " + porcentajePortugues + "%");
        System.out.println("Porcentaje Alemán: " + porcentajeAleman + "%");
    }   
}
