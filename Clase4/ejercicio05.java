package Clase4;

public class ejercicio05 {

    public static void main(String[] args) {
        
        /*5. Muestra los números del 1 al 100 (ambos incluidos) divisibles 
        entre 2 y 3. Utiliza el bucle que desees.*/
      
        for(int i = 1; i <= 100; i++){
            
            if(i % 2 == 0 || i % 3 == 0){
                System.out.println(i);
            }     
        }
        
    }
    
}
