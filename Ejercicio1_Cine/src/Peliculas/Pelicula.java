/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.Scanner;

/**
 *
 * @author Leslie Callejas
 */
public class Pelicula {
    String Pelicula;
    String Horario;

    public Pelicula() {
        this.Pelicula = "Divergente la saga";
        this.Horario = "Medio dia";
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }
    
    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

}
