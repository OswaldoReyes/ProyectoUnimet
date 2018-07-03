/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Asesor {
    
    private int ci;
    private boolean activo; 
    private Caja caja;
    private int descanso; 
    private int horaD, minutoD, horaLlegada, minutoLlegada, atendidosND=0, atendidosDO=0, breaks=0; 
    public Asesor(int ci, boolean activo) {
        this.ci = ci;
        this.activo = activo; 
      
        
    }
    
    public void descanso (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Presione [1] para continuar con la jornada o [2] para tomar un descanso");
        descanso = sc.nextInt();
        
     if(descanso == 1){
         System.out.println(" Continua la jornada");
     }else if (descanso == 2)
     {
         activo = false; 
         Calendar calendario = Calendar.getInstance(); 
          horaD = calendario.get(Calendar.HOUR_OF_DAY);
           minutoD = calendario.get(Calendar.MINUTE);
           
     }
    }
    
    /* 
    public void llamadoCliente (){
    
    
    }
    */
    
    
 

    public int getHoraD() {
        return horaD;
    }

    public int getMinutoD() {
        return minutoD;
    }
    
    

    
   
   
    
}
