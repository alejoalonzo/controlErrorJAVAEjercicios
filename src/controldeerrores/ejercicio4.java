
package controldeerrores;

import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        float i = 0, j;
        j = ctrlFloat(i);// en "j" se guarda el valor que retorna la funcion
        System.out.println("Introducido correctamente, el numero es: " + j);
    }
    //---------------------------FUNCION-------------------------------------
    
    public static float ctrlFloat(float x){//me mandan un float del main
        Scanner scnn = new Scanner(System.in);
        float num;
        System.out.println("Introduzca un número decimal: ");
        
        //bucle termina hasta que el usuario introduzca lo que le pedimos
        while(scnn.hasNextFloat() == false){
            System.out.println("Error, no ha introducido un número decimal, vuelva a intentar: ");
            scnn.next();//esto es para vaciar el contenido que habia puesto el usuario
        }
        num = scnn.nextFloat();//guarda aqui lo introducido por teclado 
        return num;
    } 
}
