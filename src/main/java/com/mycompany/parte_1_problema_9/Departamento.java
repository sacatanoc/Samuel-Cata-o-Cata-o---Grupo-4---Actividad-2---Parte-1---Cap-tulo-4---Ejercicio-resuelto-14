/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_problema_9;

/**
 *
 * @author Samuel Cataño C
 */
public class Departamento {
    double importe;
    double valor_salarios;
    public Departamento(double importe, double valor_salarios) {
        this.importe = importe;
        this.valor_salarios = valor_salarios;
    }
    public double total_salarios(double ventas_totales){
        if (this.importe>0.33*ventas_totales) {
            return Math.floor(100*this.valor_salarios * 1.2+0.05)/100;
        } else {
            return this.valor_salarios;
        }
    }
}
