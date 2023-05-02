/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.llamadosfuncion;

/**
 *
 * @author lucho
 */
public class LLAMADOSFUNCION {

     public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int resultado = sumar(num1, num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
    }

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }
}
