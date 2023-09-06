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
public class EXCER15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int a,b,c,d;
        
        System.out.println("Ingrese el peso de la esfera A");
        a = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera B");
        b = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera C");
        c = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera D");
        d = entrada.nextInt();
        
        if ((a == b) && (a == c)) {
            if (d > a) {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        } else if ((a == b) && (a == d)) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (c > a) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if ((a == c) && (a == d)) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (b > d) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (a > b) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }
        entrada.close();
    }
}