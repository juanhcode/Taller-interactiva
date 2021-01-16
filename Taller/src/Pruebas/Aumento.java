/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Scanner;

/**
 *
 * @author cifu1
 */
public class Aumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        double anios, salario;
        double almacena, aumento = 0;
        double resultado = 0;
        
        System.out.println("digite el numero de anios: ");
        anios = scan.nextInt();
        
        System.out.print("Escriba su salario: ");
            salario = scan.nextInt();
        
        for(int i=0; i<=anios; i++)
        {
            
            almacena = i * 0.05;
            aumento = salario * almacena;
            resultado = aumento + salario;
        }
        
        System.out.print("su salario en cada anio es: " +resultado);
       
        
        
    }
    
}
