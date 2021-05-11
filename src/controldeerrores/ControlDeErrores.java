
package controldeerrores;

/*
En el comtrol de errores podemos usar el try-catch, basicamente para que el ussuario no se encuentre con un 
fatal error rojo y mejor le salga un mensaje mas amigable y le de informacion de que debe hacer
*/
import java.util.Scanner;
public class ControlDeErrores {
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        
        int x;//por ejemplo aqui el programa espera que el usuario meta un entero, si por lo que  sea se equivoca nos anticipamos
        System.out.println("Dame un numero entero");
        
        try{//metemos aqui en el try el codigo que es suceptible a error
            x= key.nextInt();
            System.out.println(x);
        }catch(Exception e){
            System.out.println("Error, usted no ha introducido un numero entero");
        }finally{// esto aparece si o si al final del programa, es opcional
            System.out.println("Fin del programa");
        }
    }
    
}
