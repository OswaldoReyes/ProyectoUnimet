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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    
        Administrador admin = new Administrador ();
        Asesor ases = new Asesor ();
        Cliente cl = new Cliente (); 
        
        Scanner sc = new Scanner(System.in);
        int respuesta = 0, RespuestaAdmin;
        int contrasena = 0;
       
        
        
        while (respuesta == 0){
            System.out.println("ingrese su tipo de usuario ");
            int usuario=sc.nextInt(); 
            switch(usuario){
           
                case 1: {
                System.out.println("ingrese su contraseña  ");
                 contrasena=sc.nextInt(); 
                 
                 if (contrasena!= 11) {
                        
                         do {
                              System.out.println("ingrese la contraña correcta o escriba 0000 si se ha equivocado ");
                                 contrasena=sc.nextInt(); 
                                 
                         }while ( contrasena!= 11 || contrasena != 0000);
                }
                 if (contrasena == 0000 ){
                     break;
                 }
                    do {
                              
                                 
                      
                     System.out.println("Administrador usted dispone de las siguientes opciones Presione : ");
                     System.out.println("1) Activar o Desactivar cajas  ");
                     System.out.println("2) asignar asesores a cajas   ");
                     System.out.println("3) Establecer Ritmo de atencion");
                     System.out.println("4) Solicitar reporte de Un clienten");
                     System.out.println("5) Salir del Sistema ");
                     RespuestaAdmin =sc.nextInt();
                     
                      switch( RespuestaAdmin){
                                        case 1: {
                                            System.out.println(" entro aqui1");
                                              }
                                        case 2: {
                                            System.out.println(" entro aqui2");
                                              }
                                        case 3: {
                                            System.out.println(" entro aqui3");
                                              }
                                        case 4: {
                                            System.out.println(" entro aqui4");
                                              }
                      }}while ( RespuestaAdmin != 5);
            
                    } case 2: {
                
            }
            case 3:{
                
            }
                
        }
            System.out.println("¿desea terminar el dia? Si = 1 NO = 0");
             respuesta=sc.nextInt();
        }
    }
}
