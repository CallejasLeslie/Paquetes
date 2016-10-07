/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiones;

/**
 *
 * @author Leslie Callejas
 */
public class Division {

    private int num1;
    private int num2;

    //Metodos (Constructor - Convencional).
    public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Division() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public int generarDivision() {
        int sum = this.num1 / this.num2;
        return sum;
    }

}
