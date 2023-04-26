/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class ejecutable05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Hospital siHospital = new Hospital();
        String nom;
        int camas;
        double presu;
        // Dar valores a los atributos
       
        // los valores ingresados por teclado
        System.out.println("Ingrese el nombre del hospital: ");
        siHospital.establecerNombre(entrada.nextLine());
        System.out.println("Ingrese el numero de camas del hospital: ");
        siHospital.establecerNumeroCamas(entrada.nextInt());
        System.out.println("Ingrese el presupuesto del hospital: ");
        siHospital.establecerPresupuesto(entrada.nextDouble());
        
 System.out.printf("%s - %d - %.2f\n",  siHospital.obtenerNombre(), 
                 siHospital.obtenerNumeroCamas(),  siHospital.obtenerPresupuesto());
    }
}
