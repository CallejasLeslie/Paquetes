/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import usuarios.Usuario;

/**
 *
 * @author Leslie Callejas
 */
public class Caja {

    private Usuario user1, user2, user3, user4;

    public Caja() {
        user1 = new Usuario("Jose");
        user2 = new Usuario("Iker");
        user3 = new Usuario("Isa");
        user4 = new Usuario("Jazmin");
    }
    
    public void Actualizar(){
    user1.guardar(1245);
    user2.guardar(3422);
    user3.guardar(4567);
    user4.guardar(9000);
    user1.sacar(400);
    user2.sacar(450);
    user3.sacar(2000);
    }
    
    public void dineroTotal(){
        int total= user1.dinero()+user2.dinero()+user3.dinero()+user4.dinero();
        System.out.println("En la caja fuerte hay: "+total+" pesos");
        System.out.println();
        user1.mostrarDatos();
        user2.mostrarDatos();
        user3.mostrarDatos();
        user4.mostrarDatos();
    }

}
