/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class SistemaDeColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Administrador admin = new Administrador ();
        Asesor ases = new Asesor ();
        Cliente cl = new Cliente (); 
        
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        int contrasena = 0;
        System.out.println("ingrese su tipo de usuario ");
        int usuario=sc.nextInt(); 
        
        
        while (respuesta == 0){
            
            switch(usuario){
            case 1: {
                System.out.println("ingrese su contraseña  ");
                  contrasena=sc.nextInt(); 
                if (contrasena!= 1234) {
                do {
                 System.out.println("ingrese la contraña correcta o escriba 0000 si se ha equivocado ");
                contrasena=sc.nextInt(); 
            }while ( contrasena!= 1234 || contrasena != 0000);
                }
                
                
            }
             case 2: {
                
            }
            case 3:{
                
            }
                
        }
            System.out.println("¿desea terminar el dia? Si = 1 NO = 0");
             respuesta=sc.nextInt();
        }
    }
}
