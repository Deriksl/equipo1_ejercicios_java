/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.equipo1;

/**
 *
 * @author Derik
 */
class Ejercicio3 {
    public static void esPrimoOCompuesto(int n) {
        if (n <= 1) {
            System.out.println("El número " + n + " es compuesto");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("El número " + n + " es compuesto");
                return;
            }
        }

        System.out.println("El número " + n + " es primo");
    }
}

