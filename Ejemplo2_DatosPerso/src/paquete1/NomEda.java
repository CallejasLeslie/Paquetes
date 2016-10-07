/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Leslie Callejas
 */
public class NomEda {
    String nombre;
    int edad;
    
    public NomEda(String nombre, int edad){
    this.nombre= nombre;
    this.edad= edad;
    }
    
    public String dameNombre(){
        return nombre;
    }
    
    public int dameEdad(){
        return edad;
    }
    
}
