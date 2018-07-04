/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;
import java.util.Calendar;

public class Cliente {
    
   
   private  int ci= 0; 
   private  boolean TerceraEdad = false;
    private boolean Discapacidad = false;
    private boolean Embarazada = false;
    private boolean solicitar = false;
    private boolean retirar = false;
    private boolean nd = false;
    private boolean po = false;
     private int horallegada = 0;
     private int minutollegada = 0;

    public Cliente (int ci,boolean TerceraEdad,boolean Discapacidad,boolean Embarazada,boolean solicitar,boolean retirar,boolean nd, boolean po, int horallegada , int minutollegada ) {
    
        Calendar calendario = Calendar.getInstance();
        this.horallegada = calendario.get(Calendar.HOUR_OF_DAY); 
        this.minutollegada = calendario.get(Calendar.MINUTE); 
                
    
    
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
