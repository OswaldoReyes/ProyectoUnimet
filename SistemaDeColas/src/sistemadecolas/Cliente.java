/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;
import java.util.Calendar;
import java.util.Scanner; 

public class Cliente {
    
   
   private  int ci; 
   private  boolean TerceraEdad;
    private boolean Discapacidad;
    private boolean Embarazada;
    private boolean solicitar;
    private boolean retirar;
    private boolean nd;
    private boolean po;
     private int horallegada;
     private int minutollegada;

    public Cliente(int ci, boolean TerceraEdad, boolean Discapacidad, boolean Embarazada, boolean solicitar, boolean retirar, boolean nd, boolean po, int horallegada, int minutollegada) {
        Calendar calendario = Calendar.getInstance();
        
        this.ci = 0;
        this.TerceraEdad = false;
        this.Discapacidad = false;
        this.Embarazada = false;
        this.solicitar = false;
        this.retirar = false;
        this.nd = false;
        this.po = false;
        this.horallegada = calendario.get(Calendar.HOUR_OF_DAY); 
        this.minutollegada = calendario.get(Calendar.MINUTE); 
        
    }
    
public  Cliente IngresarU (){
    int ci= 0; 
    boolean TerceraEdad = false;
    boolean Discapacidad = false;
    boolean Embarazada = false;
    boolean solicitar = false;
    boolean retirar = false;
    boolean nd = false;
    boolean po = false;
    int des = 0;
    int res = 0;
    int elec= 0;
    int elec2 = 0;
    int horallegada = 0;
    int minutollegada = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese su numero de cedula");
        ci = sc.nextInt();
        System.out.println("Necesita alguna Atencion preferencial Si = 1 no = 2");
        des = sc.nextInt();
        if (des == 2){
           TerceraEdad = false;
           Discapacidad = false;
           Embarazada = false;  
        }else {
                     System.out.println("indique su tipo de antencion preferencial  : ");
                     System.out.println("1) Embarazada  ");
                     System.out.println("2) Tercera edad   ");
                     System.out.println("3) Discapacidad  ");
                      res = sc.nextInt();
        switch (res) {
            case 1 : {
            Embarazada = true;
        }
            case 2 : {
            TerceraEdad = true;
        }
           case 3 : {
            Discapacidad = true;
        }  
        }
        }
            System.out.println(" ¿usted desea retirar o solictar algun producto? retirar  = 1 solicitar = 0");
           elec= sc.nextInt();
            if (elec == 1){
              retirar = true;  
            }else if (elec== 0){
                solicitar = true;
            }
            
            System.out.println(" ¿cual es su producto? ND = 1 NO = 0");
            elec2= sc.nextInt();
            if (elec2 == 1){
             nd = true;  
            }else if (elec2== 0){
                po = true;
            }
                
        return new Cliente (ci,TerceraEdad, Discapacidad, Embarazada, solicitar, retirar, nd, po, horallegada, minutollegada );
    }

    public int getCi() {
        return ci;
    }

    public boolean isTerceraEdad() {
        return TerceraEdad;
    }

    public boolean isDiscapacidad() {
        return Discapacidad;
    }

    public boolean isEmbarazada() {
        return Embarazada;
    }

    public boolean isSolicitar() {
        return solicitar;
    }

    public boolean isRetirar() {
        return retirar;
    }

    public boolean isNd() {
        return nd;
    }

    public boolean isPo() {
        return po;
    }

    public int getHorallegada() {
        return horallegada;
    }

    public int getMinutollegada() {
        return minutollegada;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setTerceraEdad(boolean TerceraEdad) {
        this.TerceraEdad = TerceraEdad;
    }

    public void setDiscapacidad(boolean Discapacidad) {
        this.Discapacidad = Discapacidad;
    }

    public void setEmbarazada(boolean Embarazada) {
        this.Embarazada = Embarazada;
    }

    public void setSolicitar(boolean solicitar) {
        this.solicitar = solicitar;
    }

    public void setRetirar(boolean retirar) {
        this.retirar = retirar;
    }

    public void setNd(boolean nd) {
        this.nd = nd;
    }

    public void setPo(boolean po) {
        this.po = po;
    }

    public void setHorallegada(int horallegada) {
        this.horallegada = horallegada;
    }

    public void setMinutollegada(int minutollegada) {
        this.minutollegada = minutollegada;
    }

    

 
        
    
     
                
    
    
    }

   
    
    

    
 

