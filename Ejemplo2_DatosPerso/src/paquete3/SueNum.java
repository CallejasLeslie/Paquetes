/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author Leslie Callejas
 */
public class SueNum {
    String sueldo;
    String numdetrabajador;
    
    public SueNum(String sueldo, String numdetrabajador){
    this.sueldo= sueldo;
    this.numdetrabajador= numdetrabajador;
    }
    
    public String dameSueldo(){
        return sueldo;
    }
    
    public String dameNum(){
        return numdetrabajador;
    }
    
}
