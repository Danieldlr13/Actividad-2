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
public class EXCER13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int valor,p_final,descuento;
        String color;
        
        System.out.println("Ingrese el valor de la compra: ");
        valor = entrada.nextInt();
        System.out.println("Ingrese el color de la bola: ");
        color = entrada.next();
        
        if (color.equals("BLANCO")){descuento = 0;}
        else if (color.equals("VERDE")){descuento = 10;}
        else if (color.equals("AMARILLO")){descuento = 25;}
        else if (color.equals("AZUL")){descuento = 50;}
        else {descuento = 100;}     
        
        p_final = valor - (valor*descuento/100);
        
        System.out.println("EL CLIENTE DEBE PAGAR:$ "+p_final);
        entrada.close();
        
    }
    
}
