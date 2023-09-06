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
public class EXCER22 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        int horas_tra, salario_basico, salario_mensual;        
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el salario basico por hora: ");
        salario_basico = entrada.nextInt();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas_tra = entrada.nextInt();
        
        salario_mensual = horas_tra*salario_basico;
        
        System.out.println();       
        if (salario_mensual>450000){
            System.out.println("Nombre: "+ nombre);
            System.out.println("Salario mensual: "+salario_mensual);
        }
        else {
            System.out.println("Noombre: "+nombre);
        }
        entrada.close();
    }
    
}
