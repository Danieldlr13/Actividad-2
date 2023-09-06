/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class EXCER23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, discriminante, x1, x2, x;

        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        C = entrada.nextDouble();

        discriminante = B * B - 4 * A * C;

        if (discriminante > 0) {
            x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            x = -B / (2 * A);
            System.out.println("La solución es: x = " + x);
        } else {
            System.out.println("No hay soluciones reales.");
        }
        entrada.close();
    }
}