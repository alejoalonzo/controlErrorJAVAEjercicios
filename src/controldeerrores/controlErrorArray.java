
package controldeerrores;

import java.util.Scanner;
public class controlErrorArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int [] array = {30, 50, 10, 15, 60};
        int x;
        
        /*
        Sabemos que el usuario se puede equivocar y meter un numero de array que no hay, este array es
        de 5 casillas, por ejemplo el cliente puede meter que quereve ve la posicion 6
        */
        try{
            System.out.println("Que posicion quieres mostrar: ");
            x =  scan.nextInt();
            System.out.println("El resulatdo es: " + array [x]);
        }
        
        catch(Exception escep){//tratamos el la exception para que no salga un FATAL ERROR
            System.out.println("Te has salido del rango" + escep);
        }
        
        finally{//esto  es opcional
            System.out.println("Fin del programa");
        }
        
        
    }
    
}
