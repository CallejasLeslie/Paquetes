/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete1.NomEda;
import paquete2.DirEst;
import paquete3.SueNum;

/**
 *
 * @author Leslie Callejas
 */
public class Principa {
    static void imprime(NomEda usr1, DirEst usr2,SueNum usr3 ){
        System.out.println("\nNombre: "+ usr1.dameNombre());
        System.out.println("\nEdad: "+ usr1.dameEdad());
        System.out.println("\nDireccion: "+ usr2.dameDireccion());
        System.out.println("\nEstado: "+ usr2.dameEstado());
        System.out.println("\nSueldo: "+ usr3.dameSueldo());
        System.out.println("\nNumero de trabajador: "+ usr3.dameNum());
    
    }
    public static void main (String[]args){
    NomEda nomeda = new NomEda("Leslie", 19);
    DirEst direst = new DirEst("Calle Del Carril s/n La Martinica ", "Veracuz");
    SueNum suenum = new SueNum("$2000.00", "152T0167");
    imprime(nomeda,direst,suenum);
    }
}
