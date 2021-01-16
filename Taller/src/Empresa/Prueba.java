/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos
        Secretario secretario = new Secretario("despacho", 4, "Emanuel", "Benjumea", "100690554", "Calle 32", "1", "3138134783", 4000, "Supervisor");
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de años transcurridos");
        int anio_transcurrido = consola.nextInt();

        double resultado = (anio_transcurrido * 0.05); // 0.25
        double resultado_d = resultado * secretario.getSalario();
        double resultado1 = resultado_d + secretario.getSalario();
        secretario.imprimir1(); //Salario ACtual
        secretario.incrementarSalario(resultado_d);
        secretario.imprimir1(); //slario modificado
    }

}
