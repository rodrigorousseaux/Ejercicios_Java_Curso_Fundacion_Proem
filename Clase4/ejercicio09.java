package Clase4;

public class ejercicio09 {

    public static void main(String[] args) {
        
        int producto = 1;
        
        for(int i = 1; i <=19; i+=2){
            
            producto *= i;
        }
        
        System.out.println("El producto de los primeros 10 numero impares es " + producto);
        
    }
    
}
