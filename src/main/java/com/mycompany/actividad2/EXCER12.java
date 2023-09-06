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
public class EXCER12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nom;
        int nht, vhn, het, hee8, salario;
        System.out.println("Ingrese el nombre del trabajador: ");
        nom = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        nht = entrada.nextInt();
        System.out.println("Ingrese el valor por hora trabajada: ");
        vhn = entrada.nextInt();
        
        if (nht > 40) {
            het = nht - 40;

            if (het > 8) {
                hee8 = het - 8;
                salario = 40 * vhn + 16 * vhn + hee8 * 3 * vhn;
            } else {
                salario = 40 * vhn + het * 2 * vhn;
            }
        } else {
            salario = nht * vhn;
        }        
        System.out.println("EL TRABAJADOR " + nom + " DEVENGO: $" + salario );
        entrada.close();
    }
    
}
