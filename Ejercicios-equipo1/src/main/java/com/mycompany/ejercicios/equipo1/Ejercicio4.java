/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.equipo1;

/**
 *
 * @author Derik
 */
class Ejercicio4 {
    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo");
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
} 

