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
public class EXCER18 {
    public static void main(String[] args) {
        double numero_horas, valor_hora, rte, salario_bruto, salario_neto;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el codigo del empleado: ");
        String codigo = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();   
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        numero_horas = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de cada hora trabajada: ");
        valor_hora = entrada.nextDouble();
        
        System.out.println("Ingrese el porcentje de retencion en la fuente: ");
        rte = entrada.nextDouble();       
        rte = (rte/100);
    
        salario_bruto = numero_horas*valor_hora;
        salario_neto = salario_bruto-(salario_bruto*rte);
        
        System.out.println();        
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario bruto: "+salario_bruto);
        System.out.println("Salario neto: "+salario_neto);
        entrada.close();
    }
    
}
