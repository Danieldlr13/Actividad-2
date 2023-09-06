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
public class EXCER14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double vt1, vt2, vt3, salario, sala1, sala2, sala3, totalv,p_venta;
        
        System.out.println("Ventas del departamento 1: ");
        vt1 = entrada.nextDouble();
        System.out.println("Ventas del departamento 2: ");
        vt2 = entrada.nextDouble();
        System.out.println("Ventas del departamento 3: ");
        vt3 = entrada.nextDouble();
        System.out.println("Salario de los vendedores en cada departamento: ");
        salario = entrada.nextDouble();
        
        totalv = vt1 + vt2 + vt3;       
        p_venta = 0.33*totalv;
        
        if (vt1>p_venta){sala1 = salario + 0.2*salario;}
            else {sala1 = salario;}
        if (vt2>p_venta){sala2 = salario+0.2*salario;}
            else {sala2 = salario;}
        if (vt3>p_venta){sala3 = salario+0.2*salario;}
            else {sala3 = salario;}
        
        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + sala1 +
                ", SALARIO VENDEDORES DEPTO. 2: " + sala2 + 
                ", SALARIO VENDEDORES DEPTO. 3: " + sala3);
        entrada.close();
    }
    
}
