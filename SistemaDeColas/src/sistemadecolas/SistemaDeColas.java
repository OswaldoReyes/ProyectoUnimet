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
        Asesor ases;
        
         Cliente Provisional;
        Cliente Comun[] = new Cliente [1000]; 
        Cliente preferencial[] = new Cliente [1000];
        
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        int contrasena = 0;
       int RespuestaAdmin= 0;
        
        
        while (respuesta == 0){
                     System.out.println("Bienvenido, ingrese que tipo de usuario es. Presione : ");
                     System.out.println("1) Si es administrador   ");
                     System.out.println("2) si es Asesor   ");
                     System.out.println("3) si es Cliente  ");
            int usuario=sc.nextInt(); 
            switch(usuario){
           
                case 1: {
                System.out.println("Ingrese su contraseña  ");
                 contrasena=sc.nextInt(); 
                 
                 if (contrasena!= 11) {
                        
                         do {
                              System.out.println("Ingrese la contraña correcta  ");
                                 contrasena=sc.nextInt(); 
                                 
                         }while ( contrasena!= 11 );
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
                                              break;
                                              }
                                        case 2: {
                                            System.out.println(" entro aqui2");
                                              break;
                                              }
                                        case 3: {
                                            System.out.println(" entro aqui3");
                                              break;
                                              }
                                        case 4: {
                                            System.out.println(" entro aqui4");
                                              break;
                                              }
                                       
                      }
                    }while ( RespuestaAdmin !=5 );
            break;
                    } case 2: {
                        
                    System.out.println("Ingrese su contraseña  ");
                    contrasena=sc.nextInt(); 
                     
                     if (contrasena!= 22) {
                        
                     do {
                     System.out.println("Ingrese la contraña correcta  ");
                     contrasena=sc.nextInt(); 
                                 
                     }while ( contrasena!= 22 );       
                     
                }   
                    ases=Sistema.registrarAsesor(); 
                    if(ases.descansoAsesor()) {
                        System.out.println(" Desea regresar de su descanso? ");
                        System.out.println("Presione [1] para Si o [2] para No ");
                        int r = sc.nextInt(); 
                        if ( r== 1)
                    ases.comprobarDescanso();
                        
                    
                        
                    }
             break;            
            }
                   
            case 3:{
              System.out.println("Estimado cliente ingrese sus datos  ");  
             Provisional = Sistema.IngresarU();
                System.out.println("Se le llamará por los últimos 4 dígitos de su cédula");
             
                
             break;
            }
                
        }
            System.out.println("¿desea terminar el dia? Si = 1 NO = 0");
             respuesta=sc.nextInt();
        }
    }
}
