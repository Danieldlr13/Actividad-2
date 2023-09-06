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
public class EXCER10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int estrato, patrimonio, matricula;
        matricula = 50000;
        String nombre, numero;
        
        System.out.println("Ingrese el numero de inscripcion: ");
        numero = entrada.nextLine();
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el valor de patrimonio: ");
        patrimonio = entrada.nextInt();
        System.out.println("Ingrese el numero de estrato social: ");
        estrato = entrada.nextInt();
        int incremento = matricula+((3*patrimonio)/100);
        if (patrimonio > 2000000 && estrato > 3) {
            System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numero + " Y NOMBRE " + nombre + " DEBE PAGAR $" + incremento);
        } else {
            System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numero + " Y NOMBRE " + nombre + " DEBE PAGAR $" + matricula);
        }
        entrada.close();
    }
    
}
