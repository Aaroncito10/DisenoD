/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segurosocial;

import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Segurosocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables// 

        int cantidadEmpleados = 0;
        double salariosIndividuales = 0;
        double salarioDeduccionesSem = 0;
        double salarioDeduccionesIvm = 0;
        double salarioNeto = 0;
        int empleados = 0;
        double deduccionSem = 0.0925;
        double deduccionIvm = 0.0508;

        //Entrada de datos// 
        System.out.println("Bienvenido al sistema de calculo de salarios y deducciones...");

        cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados que desea agregar : "));
        salariosIndividuales = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario individual : "));

        //Calculos Matematicos// 
        salarioDeduccionesSem = salariosIndividuales * deduccionSem;
        salarioDeduccionesIvm = salariosIndividuales * deduccionIvm;
        salarioNeto = salariosIndividuales + deduccionIvm + deduccionSem;

        System.out.println("Su salario neto con deducciones es de: " + salarioNeto);

    }

}
