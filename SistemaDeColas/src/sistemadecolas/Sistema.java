/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecolas;

import java.util.Scanner;



public class Sistema {
   
    
    
    
    public static Cliente IngresarU (){
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
    int ninutollegada = 0;
        
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
                
        return new Cliente (ci,TerceraEdad, Discapacidad, Embarazada, solicitar, retirar, nd, po,horallegada, ninutollegada );
    }
    
    public static Asesor registrarAsesor(){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Ingrese su cedula de identidad");
        int ci = sc.nextInt(); 
        boolean activo = true; 
     
        return new Asesor(ci, activo);
    }
}
