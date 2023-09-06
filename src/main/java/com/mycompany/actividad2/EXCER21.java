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
public class EXCER21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1, lado2, lado3, perimetro, semiperimetro, area,s;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo: ");
        lado3 = entrada.nextDouble();
        
        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro/2;
    
        s = semiperimetro;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        
        System.out.println("El perimetro del triangulo: " + perimetro);
        System.out.println("El semiperimetro del triangulo: " + semiperimetro);
        System.out.println("El area del triangulo: " + area);
        entrada.close();
    }
    
}
