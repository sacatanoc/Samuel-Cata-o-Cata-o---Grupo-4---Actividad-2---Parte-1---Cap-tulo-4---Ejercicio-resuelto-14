/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_9;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double vd1, vd2, vd3, salar, totven, porven, salar1, salar2, salar3;
        System.out.println("Por favor ingrese el valor del salario de los empleados:");
        salar = lector.nextDouble();
        System.out.println("Por favor ingrese el total de ventas del departamento 1:");
        vd1 = lector.nextDouble();
        System.out.println("Por favor ingrese el total de ventas del departamento 2:");
        vd2 = lector.nextDouble();
        System.out.println("Por favor ingrese el total de ventas del departamento 3:");
        vd3 = lector.nextDouble();
        
        totven = vd1+vd2+vd3;
        porven = 0.33*totven;
        
        if (vd1>porven) {salar1 = salar+salar*0.2;} else {salar1 = salar;}
        if (vd2>porven) {salar2 = salar+salar*0.2;} else {salar2 = salar;}
        if (vd3>porven) {salar3 = salar+salar*0.2;} else {salar3 = salar;}
        
        System.out.println("Salario vendedores dept. 1: "+salar1+"Salario vendedores dept. 2: "+salar2+"Salario vendedores dept. 3: "+salar3);
    }
}
