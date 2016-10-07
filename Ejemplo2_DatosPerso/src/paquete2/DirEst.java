/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Leslie Callejas
 */
public class DirEst {
    String direccion;
    String estado;
    
    public DirEst(String direccion, String estado){
    this.direccion= direccion;
    this.estado= estado;
    }
    
    public String dameDireccion(){
        return direccion;
    }
    
    public String dameEstado(){
        return estado;
    }
    
}
