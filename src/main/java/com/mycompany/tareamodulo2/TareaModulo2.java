/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamodulo2;

/**
 *
 * @author DPLPT90
 */
public class TareaModulo2 {

    public static void main(String[] args) {

        Recursos recursos = new Recursos(); 
        
        System.out.println(recursos.obtenerMensaje());

        int edad = 20;
        System.out.println("Edad del estudiante: " + edad);
        System.out.println(recursos.verificarEdad(edad));

        int num1 = 5;
        int num2 = 3;
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + recursos.multiplicar(num1, num2));

        int x = 10; 
        System.out.println("Lista de numeros del 1 al " + x + ": " + recursos.generarListaNumeros(x));
    }
}


