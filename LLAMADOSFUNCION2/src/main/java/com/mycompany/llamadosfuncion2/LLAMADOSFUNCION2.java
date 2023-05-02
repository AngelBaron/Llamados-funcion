/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.llamadosfuncion2;

/**
 *
 * @author lucho
 */
public class LLAMADOSFUNCION2 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int mayor = obtenerMayor(num1, num2);
        System.out.println("El número mayor entre " + num1 + " y " + num2 + " es " + mayor);
    }

    public static int obtenerMayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
