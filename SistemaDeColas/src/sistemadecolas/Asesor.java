/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author Estudiantes
 */
public class Asesor {
    
    private int ci;
    private boolean activo; 
    private Caja caja;
    private int horaDes, minutoDes, horall, minutoll, ci2;
    
    Scanner sc = new Scanner(System.in);
    Calendar calendario = Calendar.getInstance();

    public Asesor(int ci, boolean activo) {
        this.ci = ci;
        this.activo = activo; 
 
    }
    
   
   /*public void llamarCliente(){
        
       
    
        
        if(Provisional.getIsTerceraEdad()==true || Provisional.getIsEmparazada() == true || Provisional.getIsDiscapacidad() == true {
        Cliente Preferencial [] = Cliente Provisional; 
        }else{
        Cliente Comun [] = Cliente Provisional;
        }
        
        for (int i = 0: i < Cliente comun.lenght; i++){
        
        if(Cliente Comun[i])
        
        }
      
        
       
        
  
           
    
        */
    //}
    
    public boolean descansoAsesor (){
        System.out.println("Presione [1] para cerrar la caja o [2] para continuar con la jornada ");
        int descanso = sc.nextInt();
        
        if(descanso == 1){
            activo = false; 
            horaDes = calendario.get(Calendar.HOUR_OF_DAY);
            minutoDes= calendario.get(Calendar.MINUTE);
            System.out.println("El descanso comenzo a las: " + horaDes + " horas y " + minutoDes + " minutos.");
            
            return true; 
            
        } else{
            return false;      
        }     
    }
   
    public void comprobarDescanso (){
        System.out.println("Ingrese su cedula de identidad nuevamente ");
        ci2 = sc.nextInt();
        horall=calendario.get(Calendar.HOUR_OF_DAY);
        minutoll=calendario.get(Calendar.MINUTE); 
        activo = true;
        System.out.println("Ha regresado de su descanso a las: " + horall + " horas y " + minutoll + " minutos.");
        
    }

    public int getCi() {
        return ci;
    }

    public int getHorall() {
        return horall;
    }

    public int getMinutoll() {
        return minutoll;
    }

    public int getCi2() {
        return ci2;
    }
    
    public int getHoraDes() {
        return horaDes;
    }

    public int getMinutoDes() {
        return minutoDes;
    }    
}
