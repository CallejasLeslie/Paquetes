/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import divisiones.Division;
import java.io.*;
import multiplicaciones.Multiplicaciones;
import restas.Restas;
import sumador.Sumas;

/**
 *
 * @author Leslie Callejas
 */
public class Principal {

    //Objetos Leer Datos Teclado
    public static InputStreamReader Leer = new InputStreamReader(System.in);
    public static BufferedReader Teclado = new BufferedReader(Leer);

    public static void main(String[] args) throws IOException {
        boolean bandera = true;

        while (bandera) {
            System.out.println("\nMenu de opciones\n");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("ingrese la opcion deseada");
            int o = Integer.parseInt(Teclado.readLine());
            if (o == 1) {
                System.out.print("Ingrese valor 1: ");
                int valor1 = Integer.parseInt(Teclado.readLine());
                System.out.print("Ingrese valor 2: ");
                int valor2 = Integer.parseInt(Teclado.readLine());
                Sumas Obj1 = new Sumas(valor1, valor2);
                int resul = Obj1.generarSuma();
                System.out.println("Resultado = " + resul);
            } else if (o == 2) {
                System.out.print("Ingrese valor 1: ");
                int valor1 = Integer.parseInt(Teclado.readLine());
                System.out.print("Ingrese valor 2: ");
                int valor2 = Integer.parseInt(Teclado.readLine());
                Restas Obj2 = new Restas(valor1, valor2);
                int resul = Obj2.generarResta();
                System.out.println("Resultado = " + resul);

            } else if (o == 3) {
                System.out.print("Ingrese valor 1: ");
                int valor1 = Integer.parseInt(Teclado.readLine());
                System.out.print("Ingrese valor 2: ");
                int valor2 = Integer.parseInt(Teclado.readLine());
                Multiplicaciones Obj3 = new Multiplicaciones(valor1, valor2);
                int resul = Obj3.generarMultiplicacion();
                System.out.println("Resultado = " + resul);

            } else if (o == 4) {
                System.out.print("Ingrese valor 1: ");
                int valor1 = Integer.parseInt(Teclado.readLine());
                System.out.print("Ingrese valor 2: ");
                int valor2 = Integer.parseInt(Teclado.readLine());
                Division Obj4 = new Division(valor1, valor2);
                int resul = Obj4.generarDivision();
                System.out.println("Resultado = " + resul);

            }
            else {
                System.out.println("La opcion" + o + "no existe");
            }

        }
    }
}
