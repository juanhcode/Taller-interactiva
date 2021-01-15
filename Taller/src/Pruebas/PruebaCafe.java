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
public class PruebaCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int cantidad, resultado, resultado2;
        int cafe=1000;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("cantidad requerida:");
        cantidad = scan.nextInt();
        
        if(cantidad < cafe)
        {
            resultado = cafe - cantidad;
            System.out.println("cantidad de cafe en la taza: "+ cantidad);
            System.out.println("cantidad de la cafetera: "+ resultado);
          
        }
        else
        {
            resultado2 = cantidad -= cafe;
            int vacio = 0; 
            System.out.println("debido a la falta de cafe su taza tiene: "+ resultado2);
            System.out.println("cantidad de cafe en la cafetera: "+ vacio);
            
        }
        
        
        
        
    }
    
}
