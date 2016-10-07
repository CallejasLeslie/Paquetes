/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author Leslie Callejas
 */
public class Usuario {
    String nombre;
    int dinero;
    
    public Usuario(String nombre){
    this.nombre= nombre;
    dinero=0;
    }
    public void guardar(int din){
    dinero=dinero+din;
    }
    public void sacar(int din){
    dinero=dinero-din;
    }
    public int dinero(){
    return dinero;
    }
    public void mostrarDatos(){
    System.out.println(nombre+" tiene "+dinero+ " pesos dentro de la caja fuerte");
    
    }
}
