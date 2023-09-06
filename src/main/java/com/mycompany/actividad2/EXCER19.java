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
public class EXCER19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor, perimetro, altura, lado1, lado2, area;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado del triangulo: ");
        valor = entrada.nextDouble();
        
        perimetro = 3*valor;
        
        lado1 = Math.pow(valor,2);
        lado2 = Math.pow(valor/2,2);
        
        altura = Math.sqrt(lado1-lado2);
        area = (valor*altura)/2;
        
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("La altura del triangulo es: "+altura);
        System.out.println("El area del triangulo es: "+area);
        entrada.close();
    }
    
}
