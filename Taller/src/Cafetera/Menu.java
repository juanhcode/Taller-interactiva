/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera = false;
        int cantidad;
        Scanner consola = new Scanner(System.in);
        Cafetera cafe = new  Cafetera();
        Cafetera cafe1 = new  Cafetera(1000);
        //Cafetera cafe2 = new  Cafetera(1000,cantidad);
        
        
        int opcion;
        while (bandera != true) {
            System.out.println("1.Llenar Cafetera");
            System.out.println("2.servir Taza");
            System.out.println("3.Vacias Cafetera");
            System.out.println("4.Agregar cafe");
            System.out.println("5.Salir");
            System.out.println("Digite una opcion");
            opcion = consola.nextInt();
            switch(opcion){
                case 1:
                    cafe1.llenarCafetera();
                    System.out.println("la capacidad maxima de la cafetera es" + cafe1.getCantidad());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    bandera = true;
                    break;
                default:
                    System.out.println("Ha ocurrido un error");
            }
            
        }

    }

}
