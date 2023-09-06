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
public class EXCER24 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Peso_A, Peso_B, Peso_C;
        
        System.out.print("Ingrese el peso de la esfera A: ");
        Peso_A = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        Peso_B = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        Peso_C = entrada.nextDouble();

        // Comparar los pesos para determinar la esfera de mayor peso
        if (Peso_A > Peso_B && Peso_A > Peso_C) {
            System.out.println("La esfera de mayor peso es la A.");
        } else if (Peso_B > Peso_A && Peso_B > Peso_C) {
            System.out.println("La esfera de mayor peso es la B.");
        } else {
            System.out.println("La esfera de mayor peso es la C.");
        }

        entrada.close();
    }
}
