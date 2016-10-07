/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumador;

/**
 *
 * @author Leslie Callejas
 */
public class Sumas {

    private int num1;
    private int num2;

    //Metodos (Constructor - Convencional).
    public Sumas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Sumas() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public int generarSuma() {
        int sum = this.num1 + this.num2;
        return sum;
    }
}

