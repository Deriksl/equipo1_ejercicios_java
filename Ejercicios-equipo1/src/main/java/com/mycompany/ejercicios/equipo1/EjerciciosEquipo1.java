/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios.equipo1;
import java.util.Scanner;

/**
 *
 * @author Derik
 */
public class EjerciciosEquipo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio1
        System.out.print("Ingrese la altura del rectángulo: ");
        int alto = scanner.nextInt();
        System.out.print("Ingrese el ancho del rectángulo: ");
        int ancho = scanner.nextInt();
        Ejercicio1.dibujarRectangulo(alto, ancho);
        
        // Ejercicio2
        System.out.print("Ingrese un número para verificar si es palíndromo: ");
        int numeroPalindromo = scanner.nextInt();
        Ejercicio2.esPalindromo(numeroPalindromo);
        
        // Ejercicio3
        System.out.print("Ingrese un número para verificar si es primo o compuesto: ");
        int numeroPrimoCompuesto = scanner.nextInt();
        Ejercicio3.esPrimoOCompuesto(numeroPrimoCompuesto);

        
        // Ejercicio4
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numeroFactorial = scanner.nextInt();
        Ejercicio4.factorial(numeroFactorial);
    }
}
    
    
