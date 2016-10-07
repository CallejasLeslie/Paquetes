/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimentos;

import java.util.Scanner;

/**
 *
 * @author Leslie Callejas
 */
public class Alima {

    String Alimento;
    String Bebida;

    public Alima() {
        this.Alimento = "Palomitas";
        this.Bebida = "Cocacola";
    }

    public String getAliemnto() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }
    
    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }

}
