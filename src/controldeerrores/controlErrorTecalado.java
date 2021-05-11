
package controldeerrores;

/**
ejercicio para coonocer el ".hasNext..." para saber si lo que se ha metido por teclado es lo que buscamos
 */
import java.util.Scanner;
public class controlErrorTecalado {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
    
        int numero;
        /*
        Pedimos un numero al cliente, si falla  el hasNext (hace de booleano) seria false
        y como es == a false  imprime la siguiente linea.
        si fuera true o sea que se equivoque el usuario  entra en el bucle y repite hasta que 
        el usuario meta lo que le pedimos
        */
        System.out.println("Escriba un numero: ");
        while(teclado.hasNextInt()== false){
            System.out.println("Error, no has puesto un numero: ");
            teclado.next();//esto es para vaciar el contenido que habia puesto el usuario
        }
        
        numero = teclado.nextInt();//guarda aqui lo introducido por teclado 
        System.out.println("Introducido correctamente, el numero es: " + numero);
    }
}