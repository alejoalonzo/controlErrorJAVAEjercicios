
package controldeerrores;

import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        int i = 0, j;
        j = ctrlInt(i);// en "j" se guarda el valor que retorna la funcion
        System.out.println("Introducido correctamente, el numero es: " + j);
    }
    
    //---------------------------FUNCION-------------------------------------
    
    public static int ctrlInt(int x){//me mandan un int del main
        Scanner scnn = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        
        //bucle termina hasta que el usuario introduzca lo que le pedimos
        while(scnn.hasNextInt() == false){
            System.out.println("Error, no has introducido un número, vuelve a intentar: ");
            scnn.next();//esto es para vaciar el contenido que habia puesto el usuario
        }
        num = scnn.nextInt();//guarda aqui lo introducido por teclado 
        return num;
    }
}
