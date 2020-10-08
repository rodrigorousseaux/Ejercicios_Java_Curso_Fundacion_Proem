package clase3;

import java.util.Scanner;

public class ejercicio09 {

    public static void main(String[] args) {
        
        /*Escribir un programa que cuando el usuario ingrese el mes, me diga
        cuantos días tiene.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String mes;
        
        System.out.print("Ingrese un mes: ");
        mes = entrada.nextLine();
        
        System.out.println("");
        
        if("Enero".equals(mes) || "enero".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else if("Febrero".equals(mes) || "febrero".equals(mes)){
            System.out.println(mes + ": 28 dias");
        }
        else if("Marzo".equals(mes) || "marzo".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else if("Abril".equals(mes) || "abril".equals(mes)){
            System.out.println(mes + ": 30 dias");
        }
        else if("Mayo".equals(mes) || "mayo".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else if("Junio".equals(mes) || "junio".equals(mes)){
            System.out.println(mes + ": 30 dias");
        }
        else if("Julio".equals(mes) || "julio".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else if("Agosto".equals(mes) || "agosto".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else if("Septiembre".equals(mes) || "septiembre".equals(mes)){
            System.out.println(mes + ": 30 dias");
        }
        else if("Octubre".equals(mes) || "octubre".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else if("Noviembre".equals(mes) || "noviembre".equals(mes)){
            System.out.println(mes + ": 30 dias");
        }
        else if("Diciembre".equals(mes) || "diciembre".equals(mes)){
            System.out.println(mes + ": 31 dias");
        }
        else{
            System.out.println("El mes no existe");
        }
    }    
}
