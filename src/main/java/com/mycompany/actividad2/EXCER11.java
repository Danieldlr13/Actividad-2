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
public class EXCER11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int a,b,c, mayor;
    
    System.out.println("Ingrese el primer numero: ");
    a = entrada.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    b = entrada.nextInt();
    System.out.println("Ingrese el tercer numero: ");
    c = entrada.nextInt();
    
    if (a > b && a > c){mayor = a;}
    else if (b > c){mayor = b;}
    else {mayor = c;}
    System.out.println("EL VALOR MAYOR ENTRE " + a + ", " + b + " Y " + c + " ES " + mayor);
    entrada.close();
    }
    
}
