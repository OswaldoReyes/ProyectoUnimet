/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;

import java.util.Calendar;


public class Cliente {
    
   
   private  int ci= 0; 
   private  boolean terceraEdad = false;
    private boolean discapacidad = false;
    private boolean embarazada = false;
    private boolean solicitar = false;
    private boolean retirar = false;
    private boolean nd = false;
    private boolean po = false;
     private int horallegada = 0;
     private int minutollegada = 0;

    public Cliente (int ci,boolean terceraEdad,boolean discapacidad,boolean embarazada,boolean solicitar,boolean retirar,boolean nd, boolean po, int horallegada , int minutollegada ) {
    
    this.ci = ci; 
    this.terceraEdad = terceraEdad;
    this.discapacidad = discapacidad;
    this.embarazada = embarazada; 
    this.retirar = retirar;
    this.solicitar = solicitar;
    this.nd = nd;
    this.po = po;
            
   
        Calendar calendario = Calendar.getInstance(); 
    this.horallegada = calendario.get(Calendar.HOUR_OF_DAY);
    this.minutollegada = calendario.get(Calendar.MINUTE);
    
    }
    
    
    

    public int getHorallegada() {
        return horallegada;
    }

    public int getMinutollegada() {
        return minutollegada;
    }

    
    
   
    
    
 
}
