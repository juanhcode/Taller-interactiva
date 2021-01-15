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
        int cantidad = 0;
        Scanner consola = new Scanner(System.in);
        Cafetera cafe = new  Cafetera();
        cafe = new  Cafetera(1000);
        cafe = new  Cafetera(1000,cantidad);
        
        
        int opcion;
        while (bandera != true) {
            System.out.println("Cafetera");
            System.out.println("Capacidad maxima: " + cafe.getCapacidadMax());
            System.out.println("cantidad Actual: " + cafe.getCantidad());
            
            System.out.println("*********************************************");
            
            System.out.println("1.Llenar Cafetera");
            System.out.println("2.servir Taza");
            System.out.println("3.Vaciar Cafetera");
            System.out.println("4.Agregar cafe");
            System.out.println("5.Salir");
            System.out.println("Digite una opcion: ");
            opcion = consola.nextInt();
            switch(opcion){
                case 1:
                    cafe.llenarCafetera();
                    //System.out.println("la capacidad maxima de la cafetera es: " + cafe.getCapacidadMax());
                    break;
                case 2:
                    break;
                case 3:
                    cafe.vaciarCafetera();
                    //System.out.println("La cantidad de la cafetera es:" + cafe.getCantidad());
                    break;
                case 4:
                    System.out.println("Introduzca la cantidad");
                    cantidad = consola.nextInt();
                    cafe.agregarCafetera(cantidad);
                    
                    
                    
                    
                    
                    
                    
                    /*
                    if(cantidad < cafe.getCapacidadMax()){
                        cafe.agregarCafetera(cantidad);
                        //System.out.println("La cantidad Actual es: " + cafe.getCantidad());
                    }
                    
                    if(cantidad > cafe.getCapacidadMax()){
                        System.out.println("No se puede agregar mas cafe");
                    }
                    else{
                        System.out.println("cantidad superior a la capacidad de la cafetera");
                    }
                    */
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
