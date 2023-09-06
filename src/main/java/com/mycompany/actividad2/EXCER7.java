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
public class EXCER7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a,b;
        System.out.println("Ingrese A: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese B: ");
        b = entrada.nextDouble();       
        
        if (a>b){
            System.out.println("A ES MAYOR QUE B");
        }
        else if (a==b){
            System.out.println("A ES IGUAL A B");
        }
        else {
            System.out.println("A ES MENOR QUE B");
        }
        entrada.close();
    }
    
}
