/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import entrada.Entrada;
import sopa.Sopa;
import fuerte.Fuerte;
import postre.Postre;

/**
 *
 * @author Leslie Callejas
 */
public class Principal {
    public static void main(String [] args){
    System.out.print("Bienvenidos a La fondita de Carmen");
    System.out.print("\nMenu del dia: ");
    Entrada entra= new Entrada();
    Sopa sopa= new Sopa();
    Fuerte fuerte= new Fuerte();
    Postre postre= new Postre();
    System.out.print("\nBuen Provecho\n");
    
    
    }
    
}
