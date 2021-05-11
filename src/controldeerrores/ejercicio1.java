
package controldeerrores;

public class ejercicio1 {
    public static void main(String[] args){
        
        try{
            int a=0;
            int b=0;
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Error, el valor introducido no es valido");
        }finally{
            System.out.println("Fin del programa");
        }   
    } 
}
