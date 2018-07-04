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
    
    public void llamarCliente(){
        //los clientes seran llamados de las colas clientes preferencial y comun
        
        /*
        
        Suponiendo que:
        Clientes preferenciales pertenecen a la cola 1
        Clientes comunes pertenecen a la cola 2
        
        if(cliente.getCola() == 1 ) {
        for (int i=0; i< algo.Clientesregistradoscomun + 1; i++) {
        
        if (cliente[i].getatendido==false && transaccioncliente == transaccioncaja && productocliente==producto caja){
        System.out.println("El cliente " + 4ultimosdigitosdelacedula + "sera atendido en la caja " + caja.getnumerocaja);
        
        }else if (cliente.getCola() == 2 && algo.getclientecomunatendido = 3 ) {
        for (int i=0; i< algo.Clientesregistradospreferencial + 1; i++) {
        
        if (cliente[i].getatendido==false && transaccioncliente == transaccioncaja && productocliente==producto caja){
        System.out.println("El cliente " + 4ultimosdigitosdelacedula + "sera atendido en la caja " + caja.getnumerocaja);
        
        }
        
   
                   
                  do{
                       
                       System.out.println("El numero de cedula "+cliente[i].getCi()+" será atendido");
                       System.out.println("Respondió al llamado? Si(1) No(2)");
                       resp=sc.nextInt();
                    
                       
                       cont++;
                       
                       
                   } while(cont<3 && resp!=1);
                  
                   if(resp==1){
                     caja.AtenderCliente(cliente,cliente[i].getPosicion());
                   }else{
                       System.out.println("El cliente "+cliente[i].getCi()+" no será atendido");  
                   }
                   conta=0;
                   resp=2;
                   
                   
                  // System.out.println("El cliente "+cliente[i].getCi()+" fue atendido"); 
                  //cliente[i].setAtendido(1);
               }  

           
    
        */
    }
    
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
