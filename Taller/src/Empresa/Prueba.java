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
        Scanner consola = new Scanner(System.in);
        //int anio = consola.nextInt();
        
        
        Empleado empleado = new Empleado("Juan", "Hoyos","100690554","Calle 22","3138134783", 5000);
        Secretario secretario = new Secretario("despacho",4,"Juan", "Hoyos","100690554","Calle 22","1","3138134783", 5000,"Supervisor");
        secretario.getCadena();
        secretario.imprimir1();
        //empleado.incrementarSalario(700);
        //empleado.imprimir();
        
        
    }
    
}
