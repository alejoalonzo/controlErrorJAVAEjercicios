
package controldeerrores;

public class ejercicio2 {
    public static void main (String[] args){
        try{//Codigo susceptible a error lo encerramos en el try
            int[] array =new int[5];
            array[5]=1;
        //En el catch tratamos el error para hacerlo mas amigable
        }catch(Exception e1){//El "e1"  es el nombre de la Exception, le podemos poner cualquier otro
            System.out.println("Error, el valor introducido esta fuera de rango");
        }finally {//Esto es opcional, si lo ponemos se mostrara si o si 
            System.out.println("Fin del programa");
        }
    }  
}
