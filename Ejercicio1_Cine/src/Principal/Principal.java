/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Alimentos.Alima;
import Peliculas.Pelicula;

/**
 *
 * @author Leslie Callejas
 */
public class Principal {
    public static void main (String[]args){
        Alima alimento= new Alima();
        Pelicula pelicula= new Pelicula();
        
        System.out.println("Buen dia bienvenido a cineles");
        System.out.println("\nTu registro por internet nos dice:");
        System.out.println("\nEl alimento seleccionado fue: "+alimento.getAliemnto());
        System.out.println("La bebida seleccionada fue: "+alimento.getBebida());
        System.out.println("La pelicula seleccionada fue: "+pelicula.getPelicula());
        System.out.println("El horario seleccionado fue: "+pelicula.getHorario());
    
    }
    
}
